package fpgamegithubredux;

public class Item {
    protected String droppedDescription;
    protected String multiDroppedDescription;
    protected String inventoryDescription;
    protected String name;
    protected int value;
    protected int identDifficulty;
    protected int weight;
    //effects
    //changeEffects
    protected String useDescription;
    protected Boolean propogate = false;
    //statActionAdd
    protected int numUses;
    protected int imageID;
    //put conversation topic variable here if needed
    //craftingRequirements
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
        //empty effects array
        //empty changeEffects array
        useDescription = "";
        identDifficulty = 5;
        weight = 1;
        //empty statActionAdd array
        numUses = 1;
        imageID=-1;
        //topic
        //craftingRequirements
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
    //addCraftingRequirement
    //addChangeEffect
    //addConsequence (which adds a change effect)
    //addAction (which adds a change effect)
    //NewStatAction (Which adds to statActionAdd)
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
    //addEffect
    public Boolean getPropogate(){
        return propogate;
    }
    public String useItem(Character user, int possessionID, int forceTags){
        int i = 0;
        String useDesc= ""; //= getUseDescription();
        //all changes to stats, body parts, and other effects
        return useDesc;
    }
    public String getDescription(Character owner, Integer[] identEfficacy, Boolean keepTags){
        String desc = getName() + "\n";
        int identChance = 0;//ported over...no use seemingly
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
        if(weight > 0) desc += "You guess it weighs about " + Math.ceil(weight + (weight*weightDeviation)) + "lbs.\n";
        Boolean showing = false;
        int count = 0; //for effects and such
        //effects desc
        //changeEffects desc
        //statActionAdd desc
        
        return desc;
    }
    public int getValue(Character buyer, Character seller){
        if(buyer == null && seller == null){
            return value;
        }else{
            int valToReturn = value;
            int roll = 0;
            Challenge valueChallenge = new Challenge();
            //set attack stat for valueChallenge
            //set defense stat for valueChallenge
            valueChallenge.setVariability(10);
            if(buyer != seller){
                roll = valueChallenge.roll(buyer); //roll buyer only method
                double variance = 1;
                if(roll < 0){
                    //within 50%
                    if(Math.random() > 0.5){
                        variance += Math.random()*0.5;
                    }else{
                        variance -= Math.random()*0.5;
                    }
                }else if(roll > 20){
                    //within 1%
                    if(Math.random() > 0.5){
                        variance += Math.random()*0.01;
                    }else{
                        variance -= Math.random()*0.01;
                    }
                }else if(roll > 10){
                    //within 10%
                    if(Math.random() > 0.5){
                        variance += Math.random()*0.1;
                    }else{
                        variance -= Math.random()*0.1;
                    }
                }else if(roll >= 0){
                    //within 20%
                    if(Math.random() > 0.5){
                        variance += Math.random()*0.2;
                    }else{
                        variance -= Math.random()*0.2;
                    }
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
                            buyerValue = Math.round((int)(buyerValue * 0.9));
                        }
                    }
                }
                roll = valueChallenge.roll(seller);
                variance = 1;
				if(roll < 0){
					//within 50%
					if(Math.random() > 0.5){
						variance += Math.random()*0.5;
					}else{
						variance -= Math.random()*0.5;
					}
				}else if(roll > 20){
					//within 1%
					if(Math.random() > 0.5){
						variance += Math.random()*0.01;
					}else{
						variance -= Math.random()*0.01;
					}
				}else if(roll > 10){
					//within 10%
					if(Math.random() > 0.5){
						variance += Math.random()*0.1;
					}else{
						variance -= Math.random()*0.1;
					}
				}else if(roll >= 0){
					//within 20%
					if(Math.random() > 0.5){
						variance += Math.random()*0.2;
					}else{
						variance -= Math.random()*0.2;
					}
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
            }else{
				roll = valueChallenge.roll(buyer);
				double variance = 1;
				if(roll < 0){
					//within 50%
					if(Math.random() > 0.5){
						variance += Math.random()*0.5;
					}else{
						variance -= Math.random()*0.5;
					}
				}else if(roll > 20){
					//within 1%
					if(Math.random() > 0.5){
						variance += Math.random()*0.01;
					}else{
						variance -= Math.random()*0.01;
					}
				}else if(roll > 10){
					//within 10%
					if(Math.random() > 0.5){
						variance += Math.random()*0.1;
					}else{
						variance -= Math.random()*0.1;
					}
				}else if(roll > 0){
					//within 20%
					if(Math.random() > 0.5){
						variance += Math.random()*0.2;
					}else{
						variance -= Math.random()*0.2;
					}
				}
				valToReturn = (int)Math.round(valToReturn*variance);
			
            }
            return valToReturn;
        }
    }
    public String getDroppedDescription(){
        return name;
    }
    public void setImageID(int newImageID){
        imageID = newImageID;
    }

}
