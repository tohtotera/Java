package list08_03;

import org.apache.commons.lang3.builder.EqualsBuilder;

public class Bank {
    String name;
    String address;
    /* : */
    public boolean equals(Object o) {
        return EqualsBuilder.reflectionEquals(this, o);     /* たった1行でOK */
    }
    public void setName(String name){
    	this.name = name;
    }

    public String getName(){
    	return this.name;
    }

    public void setAdress(String adrs){
    	this.address = adrs;
    }

    public String getAdress(){
    	return this.address;
    }
}