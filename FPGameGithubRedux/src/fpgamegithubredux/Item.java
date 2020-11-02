package fpgamegithubredux;

public class Item {
    protected String droppedDescription;
    protected String multiDroppedDescription;
    protected String inventoryDescription;
    protected String name;
    protected int value;
    protected int identDifficulty;
    protected int weight;
    protected Double[] effects;//effects
    protected Object[] changeEffects;//changeEffects
    protected String useDescription;
    protected Boolean propogate = false;
    protected StatAction[] statActionAdd;//statActionAdd
    protected int numUses;
    protected int imageID;
    //put conversation topic variable here if needed
    protected ItemCntPair[] craftingRequirements;//protected Item[] craftingRequirements;//craftingRequirements
    protected Item dismantleItem;

    protected int tickCount;
    protected int destroyTick;
    protected Character spawnChar;

    public Item(){
        name = "";
        droppedDescription = "";
	    multiDroppedDescription = "";
		inventoryDescription = "";
        value = 0;
        effects = null;//empty effects array
        changeEffects = null;//empty changeEffects array
        useDescription = "";
        identDifficulty = 5;
        weight = 1;
        statActionAdd = null;//empty statActionAdd array
        numUses = 1;
        imageID=-1;
        //topic
        craftingRequirements = null;//craftingRequirements
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
        otherItem.value == value //&&
        //otherItem.effects.toString().equals(effects.toString)
        );
    }
    public void setName(String newName){
        name = newName;
    }
    public void setInventoryDescription(String newInvDesc){
        inventoryDescription = newInvDesc;
    }

    //put set topic here if needed

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
        craftingRequirements[craftingRequirements.length] = new ItemCntPair(craftRequirementItem, num);//was just [craftRequirementItem, num]
    }
    public void add_change_effect(Object o){
        Consequence consequence = new Consequence();
        consequence.addConsequence(0, 0.0, "", 0);
        //consequence.addChangeEffect(o);
        
        changeEffects[changeEffects.length] = consequence;
    }
    public void add_consequence(Consequence c){
        changeEffects[changeEffects.length] = c;
    }
    public void add_action(CharAction a){
        changeEffects[changeEffects.length] = a;
    }
    public void new_stat_action(int statID, CharAction a){
        statActionAdd[statActionAdd.length] = new StatAction(statID, a);//replaces above? see accessors
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
        if(effects[type]==null){
            effects[type] = multiplier;
        }else{
            effects[type] += multiplier;
        }			
    }
    
    public Boolean getPropogate(){
        return propogate;
    }
    public String useItem(Character user, int possessionID, int forceTags){
        int i = 0;
        String useDesc= getUseDescription();
        //all changes to stats, body parts, and other effects
        return useDesc;
    }
    public int findWeight(Integer[] identEfficacy, int identChance){
        
        double weightDeviation = 1;
        if(identEfficacy != null){
            identChance = 2*identEfficacy[0]/(identDifficulty);
            if(identEfficacy[1]!=null){
                weightDeviation -= (double)identEfficacy[1]/identDifficulty;
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
    public String describeEffects(Integer[] identEfficacy,Boolean keepTags, int identChance, String desc){
        int count;
        Boolean showing = false;
        if(effects.length > 0){
            for(count = 0;count<effects.length;count++){
                if(effects[count] != null && Math.random() <= identChance){
                    if(!showing){
                        desc += "Looks like it might have an impact on the following stats:\n";
                        showing = true;
                    }
                    if(keepTags){
                        if(effects[count] >= 0){
                            desc += "<s"+count+">";
                        }else{
                            desc += "<s-"+count+">";
                        }
                    }else{
                        //String l_string = FPalace_helper.get_stat_name_by_id(count);
                        if(identEfficacy[0]>20){
                            /*
                            if(l_string != "?"){
                                if(effects[count] >= 0){
                                    desc += "Increase " + l_string + " by "	+effects[count]+".\n";
                                }else{
                                    desc += "Increase " + l_string + " by "	+ (-effects[count]) +".\n";
                                }
                            }
                            */
                        }else if(identEfficacy[0]>10){
                            /*
                            if(l_string != "?"){
                                if(effects[count] >= 0){
                                    ret += "Increase ";
                                }else{
                                    ret += "Decrease ";
                                }
                                ret += l_string + "\n";
                            }
                            */
                        }else{
                            //if(l_string != "?")ret += l_string + "\n";
                        }
                    }
                }
            }
        }
        return desc;
    }
    public String getDescription(Character owner, Integer[] identEfficacy, Boolean keepTags){
        int identChance = 0;//ported over...no use seemingly
        String desc = getName() + "\n";
        desc += "You guess it weighs about " + findWeight(identEfficacy, identChance) + "lbs.\n";

        int count = 0; //for effects and such
        desc = describeEffects(identEfficacy,keepTags, identChance, desc);
        if(changeEffects.length > 0){
            desc += "\n";
            count = 0;
            for(count=0;count<changeEffects.length;count++){
                if(Math.random() <= identChance){
                    /*
                    if(changeEffects[count] is Consequence && changeEffects[count].changeEffects[0] != null){
                        int change_count = 0;
                        for(change_count = 0;change_count<changeEffects[count].changeEffects.length;change_count++){
                            if (changeEffects[count].changeEffects[changeCount] is Sex){
                                desc += "You think it might change your sex.\n";
                            }else if(change_effects[count].change_effects[change_count] is Character_class){
                                desc += "You think it might change your class.\n";
                            }else if(change_effects[count].change_effects[change_count] is Body_part){
                                desc += "You think it might change your body.\n";
                            }else if(change_effects[count].change_effects[change_count] is Race){
                                desc += "You think it might change your race.\n";
                            }else if(change_effects[count].change_effects[change_count] is Room){
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
        if(statActionAdd.length > 0){
            desc += "\n";
            count = 0;
            //for(count=0;count<Math.ceil(statActionAdd.length/2);count++){
            for(count=0;count<statActionAdd.length;count++){
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
        //set attack stat for valueChallenge
        //set defense stat for valueChallenge
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
                var rel_stat:int = buyer.personality.check_relationship(seller,buyer);
                var rel_ajust_value:int = buyer_value;
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
                buyer_value = rel_ajust_value;
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
                    /*
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
        if(tickCount%FPGameGithub.T1_MONTH==0 && getPropogate()&&spread==1){
            //pick an exit to spread to...
            spread = (int)Math.round(Math.random() * (currentRoom.exits.length - 1));
            Room tempRoom = currentRoom.exits[spread];
            if(tempRoom != null&&tempRoom.area != null&&tempRoom.area == currentRoom.area){
                Item tempItem= itemCopy(this);
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
    public Item itemCopy(Item toClone){
        Item retItem = new Item();
        retItem.name = toClone.name;
        retItem.inventoryDescription = toClone.inventoryDescription;
        retItem.droppedDescription = toClone.droppedDescription;
        retItem.multiDroppedDescription = toClone.multiDroppedDescription;
        retItem.value = toClone.value;
        int count = 0;
        //effects copy
        retItem.useDescription = toClone.useDescription;
        count = 0;
        //change effects copy
        retItem.propogate = toClone.propogate;
        retItem.identDifficulty = toClone.identDifficulty;
        retItem.weight = toClone.weight;
        count = 0;
        //stat action add copy
        retItem.numUses = toClone.numUses;
        retItem.imageID = toClone.imageID;
        //topic
        //crafting requirements

        retItem.tickCount = 0;
        retItem.destroyTick = toClone.destroyTick;
        retItem.spawnChar = toClone.spawnChar;

        return retItem;
    }

}
