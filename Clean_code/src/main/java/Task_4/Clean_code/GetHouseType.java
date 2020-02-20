package Task_4.Clean_code;
public class GetHouseType {

	public TotalAmount getPlan(String houseType)
	{  
        if(houseType == null){  
         return null;  
        }  
      if(houseType.equalsIgnoreCase("standard material")) {  
             return new StandardMaterial();  
           }   
       else if(houseType.equalsIgnoreCase("Abovestandard material")){  
            return new AboveStandardMaterial();  
        }   
      else if(houseType.equalsIgnoreCase("Highstandard material")) {  
            return new HighStandardMaterial();  
      }
      else if(houseType.equalsIgnoreCase("HighstandardFullautomatic")) {  
    	  return new HighStandardFullAutomatic();
      }
  return null;  
}  
}
