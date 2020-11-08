package fpgamegithubredux;

import java.util.ArrayList;

public class Item {
    protected String droppedDescription;
    protected String multiDroppedDescription;
    protected String inventoryDescription;
    protected String name;
    protected int value;
    protected int identDifficulty;
    protected int weight;
    protected ArrayList<Double> effects;//effects
    protected ArrayList<Object> changeEffects;//changeEffects
    protected String useDescription;
    protected Boolean propogate = false;
    protected ArrayList<StatAction> statActionAdd;//statActionAdd
    protected int numUses;
    protected int imageID;
    protected Conversation_topic topic;
    protected ArrayList<ItemCntPair> craftingRequirements;//protected Item[] craftingRequirements;//craftingRequirements
    protected Item dismantleItem;

    protected int tickCount;
    protected int destroyTick;
    protected Character spawnChar;
    public Item(){
        this("");
    }
    public Item(String n){
        name = n;
        droppedDescription = "";
	    multiDroppedDescription = "";
		inventoryDescription = "";
        value = 0;
        effects = new ArrayList<>();//empty effects array
        changeEffects = new ArrayList<>();//empty changeEffects array
        useDescription = "";
        identDifficulty = 5;
        weight = 1;
        statActionAdd = new ArrayList<>();//empty statActionAdd array
        numUses = 1;
        imageID=-1;
        topic = null;
        craftingRequirements = new ArrayList<>();//craftingRequirements
        tickCount = 0;
        destroyTick = -1;
        spawnChar = null;
        dismantleItem = null;
    }

    public Boolean sameItem(Item otherItem){
        return(otherItem !=null && 
        otherItem.name.equals(name) &&
        otherItem.droppedDescription.equals(droppedDescription) &&
        otherItem.multiDroppedDescription.equals(multiDroppedDescription) &&
        otherItem.inventoryDescription.equals(inventoryDescription) &&
        otherItem.value == value &&
        otherItem.effects.toString().equals(effects.toString())
        );
    }
    public void setName(String newName){
        name = newName;
    }
    public void setInventoryDescription(String newInvDesc){
        inventoryDescription = newInvDesc;
    }

    public void set_topic(Conversation_topic ct){
        topic = ct;
    }

    public void setNumUses(int initNumUses){
        numUses = initNumUses;
    }
    public void setDestroyTick(int tickToDie){
        destroyTick = tickToDie;
    }
    public void addSpawnAtTick(Character onWhich, int tickWhen){
        spawnChar = onWhich;
        setDestroyTick(tickWhen);
    }
    public void setIdentifyDifficulty(int newDiff){
        identDifficulty = newDiff;
    }
    public void setWeight(int newWeight){
        weight = newWeight;
    }
    public void setPropogate(){
        propogate = !propogate;
    }
    public void setValue(int newVal){
        value = newVal;
    }
    public void setUseDescription(String newUseDesc){
        useDescription = newUseDesc;
    }
    public void setDroppedDescription(String newDropDesc){
        droppedDescription = newDropDesc;
    }
    public void setMultiDroppedDescription(String newMultiDropDesc){
        multiDroppedDescription = newMultiDropDesc;
    }
    public void add_crafting_requirement(Item craftRequirementItem,int num){
        //craftingRequirements[craftingRequirements.length] = new ItemCntPair(craftRequirementItem, num);//was just [craftRequirementItem, num]
        craftingRequirements.add(new ItemCntPair(craftRequirementItem, num));
    }
    public void add_change_effect(DynamicObject o){
        Consequence consequence = new Consequence();
        consequence.addConsequence(0, 0.0, "", 0);
        consequence.add_change_effect(o);
        
        //changeEffects[changeEffects.length] = consequence;
        changeEffects.add(consequence);
    }
    public void addConsequence(Consequence c){
        //changeEffects[changeEffects.length] = c;
        changeEffects.add(c);
    }
    public void add_action(CharAction a){
        //changeEffects[changeEffects.length] = a;
        changeEffects.add(a);
    }
    public void new_stat_action(int statID, CharAction a){
        //statActionAdd[statActionAdd.length] = new StatAction(statID, a);//replaces above? see accessors
        statActionAdd.add(new StatAction(statID, a));
    }
    public String getName(){
        return name;
    }
    public int getImageID(){
        return imageID;
    }
    public Boolean stillUsable(){
        return numUses>0;
    }
    public int getWeight(){
        if(weight >0)return weight;
        return 0;
    }
    public int getIdentifyDifficulty(){
        return identDifficulty;
    }

    public void add_effect(int type, double multiplier){//was number
        /*
        if(effects[type]==null){
            effects[type] = multiplier;
        }else{
            effects[type] += multiplier;
        }			
        */
        System.out.println("test");
        System.out.println(effects==null);
        System.out.println(type);
        while(effects.size()<=type){//TODO oh fuck...null-fill!
            this.effects.add(null);
        }
        if(this.effects.get(type)==null){

            this.effects.set(type, multiplier);
        }else{
            this.effects.set(type,effects.get(type) + multiplier);
        }	
    }
    
    public Boolean getPropogate(){
        return propogate;
    }
    public String useItem(Character user, int possessionID){
        return useItem(user, possessionID, 0);
    }
    public String useItem(Character user, int possessionID, int forceTags){//default tags 0
        int i = 0;
        String useDesc= getUseDescription();
        for (i=0;i<effects.size();i++){//.length
            //if (effects[i] != null) useDesc+= "\n" + user.apply_affect_by_id(i,effects[i], 0, null, Body.change_stats_total);
        }
        for (i=0;i<changeEffects.size();i++){//.length
            if (changeEffects.get(i) != null){//[]
                if(changeEffects.get(i) instanceof Consequence){//[] and was is
                    useDesc += ((Consequence)changeEffects.get(i)).trigger(0, user);//[]
                    Consequence temp = (Consequence)changeEffects.get(i);
                    useDesc += temp.trigger(0,user);
                }else{//It's a CharAction
                    CharAction temp = (CharAction)changeEffects.get(i);
                    temp.set_originator(user);
                    ((CharAction)changeEffects.get(i)).set_originator(user);//[]
                    temp.set_id(user.get_all_overworld_actions().size()+possessionID);
                    ((CharAction)changeEffects.get(i)).set_id(user.get_all_overworld_actions().size()+possessionID);
                    useDesc += ((CharAction)changeEffects.get(i)).trigger(user, forceTags);
                    if((useDesc.indexOf("</a>") >=0 || useDesc.indexOf("</dc0>") >=0) && numUses > 0)numUses++;
                }
            }
        }
        
        if(statActionAdd.size() > 0){//.length
            for(i=0;i<Math.ceil(statActionAdd.size()/2);i++){//.length
                //user.addStatAction(statActionAdd[i*2], statActionAdd[i*2+1]);
                //user.addStatAction(statActionAdd.get(i*2), statActionAdd.get(i*2+1));
                //Character TODO
            }
        }
        if(numUses > 0)numUses--;
        return useDesc;
    }
    public int findWeight(ArrayList<Integer>  identEfficacy, int identChance){
        
        double weightDeviation = 1;
        if(identEfficacy != null){
            identChance = 2*identEfficacy.get(0)/(identDifficulty);//WHAT?!
            if(identEfficacy.get(1)!=null){
                weightDeviation -= (double)identEfficacy.get(1)/identDifficulty;
                if(weightDeviation <= 0)weightDeviation = 0.01;
                if(weightDeviation >= 1)weightDeviation = 0.99;
                if(Math.random() <= 0.5) weightDeviation = -weightDeviation;
                weightDeviation = weightDeviation * Math.random();
            }
        }
        int ret = (int)Math.ceil(weight + (weight*weightDeviation));
        if (ret>0){
            return ret;
        }else{
            return 0;
        }
    }
    public String describeEffects(ArrayList<Integer> identEfficacy,Boolean keepTags, int identChance, String desc){
        int count;
        Boolean showing = false;
        if(effects.size() > 0){//.length
            for(count = 0;count<effects.size();count++){
                if(effects.get(count) != null && Math.random() <= identChance){
                    if(!showing){
                        desc += "Looks like it might have an impact on the following stats:\n";
                        showing = true;
                    }
                    if(keepTags){
                        if(effects.get(count) >= 0){
                            desc += "<s"+count+">";
                        }else{
                            desc += "<s-"+count+">";
                        }
                    }else{
                        String l_string = FPalaceHelper.get_stat_name_by_id(count);
                        if(identEfficacy.get(0)>20){
                            
                            if(l_string != "?"){
                                if(effects.get(count) >= 0){
                                    desc += "Increase " + l_string + " by "	+effects.get(count)+".\n";
                                }else{
                                    desc += "Increase " + l_string + " by "	+ (-effects.get(count)) +".\n";
                                }
                            }
                            
                        }else if(identEfficacy.get(0)>10){
                            if(l_string != "?"){
                                if(effects.get(count) >= 0){
                                    desc += "Increase ";
                                }else{
                                    desc += "Decrease ";
                                }
                                desc += l_string + "\n";
                            }
                        }else{
                            if(!l_string.equals("?"))desc += l_string + "\n";
                        }
                    }
                }
            }
        }
        return desc;
    }
    public String getDescription(Character owner, ArrayList<Integer>  identEfficacy, Boolean keepTags){
        int identChance = 0;
        String desc = getName() + "\n";
        desc += "You guess it weighs about " + findWeight(identEfficacy, identChance) + "lbs.\n";

        int count = 0; //for effects and such
        desc = describeEffects(identEfficacy,keepTags, identChance, desc);
        if(changeEffects.size() > 0){//.length
            desc += "\n";
            for(count=0;count<changeEffects.size();count++){//.length
                if(Math.random() <= identChance){
                    /*
                    if(changeEffects[count] is Consequence && changeEffects[count].changeEffects[0] != null){
                        int change_count = 0;
                        for(change_count = 0;change_count<changeEffects[count].changeEffects.length;change_count++){
                            if (changeEffects[count].changeEffects[changeCount] is Sex){
                                desc += "You think it might change your sex.\n";
                            }else if(changeEffects[count].changeEffects[change_count] is Character_class){
                                desc += "You think it might change your class.\n";
                            }else if(changeEffects[count].changeEffects[change_count] is Body_part){
                                desc += "You think it might change your body.\n";
                            }else if(changeEffects[count].changeEffects[change_count] is Race){
                                desc += "You think it might change your race.\n";
                            }else if(changeEffects[count].changeEffects[change_count] is Room){
                                desc += "You think it might change where you are.\n";
                            }else{
                                desc += "There's something off about it....\n";
                            }
                        }
                    }else{
                        desc += "There's something off about it....\n";
                    }
                    */
                }
            }
        }
        if(statActionAdd.size() > 0){
            desc += "\n";
            //for(count=0;count<Math.ceil(statActionAdd.length/2);count++){
            for(count=0;count<statActionAdd.size();count++){
                if(Math.random() <= identChance){
                    desc += "It seems to be magical.\n";
                    break;
                }
            }//TODO do we never find out how magical with good enough identification? where is the else?!
        }
        
        return desc;
    }
    public int getValue(){
        return value;
    }
    public int getValue(Character checker){
        int valToReturn = value;
        int roll = 0;
        Challenge valueChallenge = new Challenge();
        //valueChallenge.setAttackStat(FPalace_skills.valuing_id);
        //valueChallenge.setDefenseStat(-1, Math.ceil(Math.sqrt(value) + 5));
        valueChallenge.setVariability(10);
        roll = valueChallenge.roll(checker);
            double variance = 1;
            if(roll<0){
                //within 50%
                variance+=(Math.random()-Math.random())*0.5;
            }else if (roll>0){
                //within 20%
                variance+=(Math.random()-Math.random())*0.2;
            }else if(roll>10){
                //within 10%
                variance+=(Math.random()-Math.random())*0.1;
            }else if(roll>20){
                //within 1%
                variance+=(Math.random()-Math.random())*0.01;
            }
            valToReturn = (int)Math.round(valToReturn*variance);
        return valToReturn;
    }
    public int getValue(Character buyer, Character seller){
        int valToReturn = value;
            int roll = 0;
            Challenge valueChallenge = new Challenge();
            //set attack stat for valueChallenge
            //set defense stat for valueChallenge
            valueChallenge.setVariability(10);
            if(buyer != seller){
                roll = valueChallenge.roll(buyer); //roll buyer only method
                double variance = 1;
                if(roll<0){
                    //within 50%
                    variance+=(Math.random()-Math.random())*0.5;
                }else if (roll>0){
                    //within 20%
                    variance+=(Math.random()-Math.random())*0.2;
                }else if(roll>10){
                    //within 10%
                    variance+=(Math.random()-Math.random())*0.1;
                }else if(roll>20){
                    //within 1%
                    variance+=(Math.random()-Math.random())*0.01;
                }
                int buyerValue = (int)Math.floor(value*variance);
                //need relationship stuff for this
                /*
                int rel_stat = buyer.personality.check_relationship(seller,buyer);
                int rel_ajust_value = buyerValue;
                if(rel_stat < -50){
                    rel_ajust_value = Math.round(rel_ajust_value*0.03125);
                }else if(rel_stat < -25){
                    rel_ajust_value = Math.round(rel_ajust_value*0.00625);
                }else if(rel_stat < -10){
                    rel_ajust_value = Math.round(rel_ajust_value*0.0125);
                }else if(rel_stat < 0){
                    rel_ajust_value = Math.round(rel_ajust_value*0.025);
                }else if(rel_stat < Personality.tolerate){
                    rel_ajust_value = Math.round(rel_ajust_value*0.05);
                }else if(rel_stat < Personality.like){
                    rel_ajust_value = Math.round(rel_ajust_value*0.1);
                }else if(rel_stat < Personality.really_like){
                    rel_ajust_value = Math.round(rel_ajust_value*0.25);
                }else if(rel_stat < Personality.friends){
                    rel_ajust_value = Math.round(rel_ajust_value*0.5);
                }else if(rel_stat < Personality.true_love){
                    rel_ajust_value = Math.round(rel_ajust_value*0.9);
                }
                buyerValue = rel_ajust_value;
                */
                //need to go through inventory and adjust value down based on how many the buyer already has
                if (buyer != null && buyer.possessions.isEmpty()){
                    for(int i = 0; i < buyer.possessions.size();i++){
                        if(Boolean.TRUE.equals(this.sameItem(buyer.possessions.get(i)))){
                            buyerValue = (int)(buyerValue * 0.9);
                        }
                    }
                }
                roll = valueChallenge.roll(seller);
                variance = 1;
                if(roll<0){
                    //within 50%
                    variance+=(Math.random()-Math.random())*0.5;
                }else if (roll>0){
                    //within 20%
                    variance+=(Math.random()-Math.random())*0.2;
                }else if(roll>10){
                    //within 10%
                    variance+=(Math.random()-Math.random())*0.1;
                }else if(roll>20){
                    //within 1%
                    variance+=(Math.random()-Math.random())*0.01;
                }
                int sellerValue = (int)Math.ceil(value*variance);
                //need relationship stuff for this
                /*
                rel_stat = seller.personality.check_relationship(buyer,seller);
				rel_ajust_value = seller_value;
				if(rel_stat < -50){
					rel_ajust_value = Math.round(rel_ajust_value*32);
				}else if(rel_stat < -25){
					rel_ajust_value = Math.round(rel_ajust_value*16);
				}else if(rel_stat < -10){
					rel_ajust_value = Math.round(rel_ajust_value*8);
				}else if(rel_stat < 0){
					rel_ajust_value = Math.round(rel_ajust_value*4);
				}else if(rel_stat < Personality.tolerate){
					rel_ajust_value = Math.round(rel_ajust_value*2.5);
				}else if(rel_stat < Personality.like){
					rel_ajust_value = Math.round(rel_ajust_value*2);
				}else if(rel_stat < Personality.really_like){
					rel_ajust_value = Math.round(rel_ajust_value*1.75);
				}else if(rel_stat < Personality.friends){
					rel_ajust_value = Math.round(rel_ajust_value*1.5);
				}else if(rel_stat < Personality.true_love){
					rel_ajust_value = Math.round(rel_ajust_value*1.1);
				}
				seller_value = rel_ajust_value
                */
                Challenge barterChallenge = new Challenge();
                //set attack
                //set defense
                barterChallenge.setVariability(20);
                roll = barterChallenge.roll(buyer,seller);
                if(roll > 20){
                    if(buyerValue < sellerValue){
                        valToReturn = buyerValue;
                    }else{
                        valToReturn = sellerValue;
                    }
                }else if(roll > 10){
                    if(buyerValue < sellerValue){
                        valToReturn = ((buyerValue + sellerValue)/2 - 2*(buyerValue - (buyerValue*buyerValue/sellerValue)));
                    }else{
                        valToReturn = ((buyerValue + sellerValue)/2 - 2*(sellerValue - (sellerValue*sellerValue/buyerValue)));
                    }
                }else if(roll < -20){
                    if(buyerValue > sellerValue){
                        valToReturn = buyerValue;
                    }else{
                        valToReturn = sellerValue;
                    }
                }else if(roll < -10){
                    if(buyerValue > sellerValue){
                        valToReturn = ((buyerValue + sellerValue)/2 + 2 * (sellerValue - (sellerValue*sellerValue/buyerValue)));
                    }else{
                        valToReturn = ((buyerValue + sellerValue)/2 + 2 * (buyerValue - (buyerValue*buyerValue/sellerValue)));
                    }
                }else if(10 >= roll && roll >= 0){
                    if(buyerValue < sellerValue){
                        valToReturn = ((buyerValue + sellerValue)/2 - (buyerValue - (buyerValue*buyerValue/sellerValue)));
                    }else{
                        valToReturn = ((buyerValue + sellerValue)/2 - (sellerValue - (sellerValue*sellerValue/buyerValue)));
                    }
                }
                else{
                    if(buyerValue > sellerValue){
                        valToReturn = ((buyerValue + sellerValue)/2 + sellerValue - (sellerValue*sellerValue/buyerValue));
                    }else{
                        valToReturn = ((buyerValue + sellerValue)/2 + buyerValue - (buyerValue*buyerValue/sellerValue));
                    }
                }
                    /*TODO verify above works alone, below Leftover from improvements
                    //0 to 10
                    if(buyerValue < sellerValue){
                        valToReturn = ((buyerValue + sellerValue)/2 - (buyerValue - (buyerValue*buyerValue/sellerValue)));
                    }else{
                        valToReturn = ((buyerValue + sellerValue)/2 - (sellerValue - (sellerValue*sellerValue/buyerValue)));
                    }
                    //-10 to <0
                    if(buyerValue > sellerValue){
                        valToReturn = ((buyerValue + sellerValue)/2 + sellerValue - (sellerValue*sellerValue/buyerValue));
                    }else{
                        valToReturn = ((buyerValue + sellerValue)/2 + buyerValue - (buyerValue*buyerValue/sellerValue));
                    }
                    */
                
                /*
                if(roll >= 0){//buyer has the advantage
					if(roll > 20){
						if(buyerValue < sellerValue){
							valToReturn = buyerValue;
						}else{
							valToReturn = sellerValue;
						}
					}else if(roll > 10){
						if(buyerValue < sellerValue){
							valToReturn = ((buyerValue + sellerValue)/2 - 2*(buyerValue - (buyerValue*buyerValue/sellerValue)));
						}else{
							valToReturn = ((buyerValue + sellerValue)/2 - 2*(sellerValue - (sellerValue*sellerValue/buyerValue)));
						}
					}else{
						if(buyerValue < sellerValue){
							valToReturn = ((buyerValue + sellerValue)/2 - (buyerValue - (buyerValue*buyerValue/sellerValue)));
						}else{
							valToReturn = ((buyerValue + sellerValue)/2 - (sellerValue - (sellerValue*sellerValue/buyerValue)));
						}
					}
				}else{//seller has the advantage
					if(roll < -20){
						if(buyerValue > sellerValue){
							valToReturn = buyerValue;
						}else{
							valToReturn = sellerValue;
						}
					}else if(roll < -10){
						if(buyerValue > sellerValue){
							valToReturn = ((buyerValue + sellerValue)/2 + 2 * (sellerValue - (sellerValue*sellerValue/buyerValue)));
						}else{
							valToReturn = ((buyerValue + sellerValue)/2 + 2 * (buyerValue - (buyerValue*buyerValue/sellerValue)));
						}
					}else{
						if(buyerValue > sellerValue){
							valToReturn = ((buyerValue + sellerValue)/2 + sellerValue - (sellerValue*sellerValue/buyerValue));
						}else{
							valToReturn = ((buyerValue + sellerValue)/2 + buyerValue - (buyerValue*buyerValue/sellerValue));
						}
					}
                }
                */
            }
            return valToReturn;
        }
    public String getUseDescription(){
        return useDescription;
    }
    public String getDroppedDescription(){
        return droppedDescription;
    }
    public String tick(Room currentRoom, Character character){
        String desc = "";
        tickCount++;
        int spread = (int)Math.round(Math.random());
        if(Boolean.TRUE.equals(tickCount%FPGameGithub.T1_MONTH==0 && getPropogate()&&spread==1)){
            //pick an exit to spread to...
            spread = (int)Math.round(Math.random() * (currentRoom.exits.size() - 1));
            Room tempRoom = currentRoom.exits.get(spread);
            if(tempRoom != null&&tempRoom.area != null&&tempRoom.area == currentRoom.area){
                Item tempItem= copyItem();
                tempRoom.newContent(tempItem);
            }						
            
        }
        if(destroyTick <= tickCount && destroyTick > 0){
            if(spawnChar != null){
                desc += "the " + getDroppedDescription() + "breaks open. ";
                spawnChar.newLocation(currentRoom);
            }
            if(character != null){
                for(int i=0;i<character.possessions.size()-1;i++){
                    if(character.possessions.get(i) == this){
                        character.drop(i);
                        break;
                    }
                }
            }else{
                currentRoom.removeContent(this);
            }
        }
        return desc;
    }
    public void setImageID(int newImageID){
        imageID = newImageID;
    }
    public Item copyItem(){
        Item retItem = new Item();
        retItem.name = name;
        retItem.inventoryDescription = inventoryDescription;
        retItem.droppedDescription = droppedDescription;
        retItem.multiDroppedDescription = multiDroppedDescription;
        retItem.value = value;
        int count = 0;

        for(count=0;count<effects.size();count++){        //effects copy, maybe toClone.effects.length?
            retItem.effects.set(count,effects.get(count));
        }
        //retItem.effects = Arrays.copyOf(effects, effects.size());//this might be enough? not with ArrayList
        //Collections.addAll(this.list, source);

        retItem.useDescription = useDescription;
        for(count=0;count<changeEffects.size();count++){
            //retItem.changeEffects[count] = changeEffects[count];
            retItem.changeEffects.set(count,changeEffects.get(count));
        }//change effects copy
        //retItem.changeEffects = Arrays.copyOf(changeEffects, changeEffects.size());//this might be enough? not with ArrayList
        retItem.propogate = propogate;
        retItem.identDifficulty = identDifficulty;
        retItem.weight = weight;
        for(count=0;count < statActionAdd.size();count++){
            retItem.statActionAdd.set(count, statActionAdd.get(count));
        }//stat action add copy
        //retItem.statActionAdd = Arrays.copyOf(statActionAdd, statActionAdd.size());//this might be enough? not with ArrayList
        retItem.numUses = numUses;
        retItem.imageID = imageID;
        //topic
        for(count=0;count < statActionAdd.size();count++){
            retItem.craftingRequirements.set(count, craftingRequirements.get(count));
        }
        //retItem.craftingRequirements = Arrays.copyOf(craftingRequirements, craftingRequirements.size());//crafting requirements

        retItem.tickCount = 0;
        retItem.destroyTick = destroyTick;
        retItem.spawnChar = spawnChar;

        return retItem;
    }

}
