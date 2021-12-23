package PL;

import java.util.Random;

public class SimplePresent extends Objects implements Methods{
	

	  static String firstSentence=" ";
	  
	  static String secondSentence=" ";
	  
	  static String thirdSentence=" ";
	  
	  static String fourthSentence=" ";
	
	  static Random r=new Random();
	  
	
	  
	  public SimplePresent()
	  {
		     randomindex=r.nextInt(subject.size());
			 randomindex1=r.nextInt(verb.size());
			 randomindex2=r.nextInt(adjective.size());
			 randomindex3=r.nextInt(object.size());
			 randomindex4=r.nextInt(adverb.size());
			 index3=r.nextInt(object.size());
			 index4=r.nextInt(object.size());
	  }
	  

	
		@Override
		public String pçtkcontrol() {
			
			if(object.get(index3).endsWith("lp") ){
				   
				   return object.get(index3).substring(0,object.get(index3).length()-1)+"bi";
				  }
				 if(object.get(index3).endsWith("ap") ){
				   
				   return object.get(index3).substring(0,object.get(index3).length()-1)+"bi";
				  }
				  else if(object.get(index3).endsWith("ep") ){
				   
				   return object.get(index3).substring(0,object.get(index3).length()-1 )+"bi";
				  }
				  else if(object.get(index3).endsWith("ak") ){
				   return object.get(index3).substring(0,object.get(index3).length()-1 )+"ðý";
				  }
				  else if(object.get(index3).endsWith("uk") ){
				   return object.get(index3).substring(0,object.get(index3).length()-1 )+"ðu";
				  }
				  else if(object.get(index3).endsWith("ek") || object.get(index3).endsWith("ik") ){
				   return object.get(index3).substring(0,object.get(index3).length()-1 )+"ði";
				  }
				  else if(object.get(index3).endsWith("aç") ){
				   
				   return object.get(index3).substring(0,object.get(index3).length()-1 )+"cý";
				  }
				      else if(object.get(index3).endsWith("eç") ){
				   
				   return object.get(index3).substring(0,object.get(index3).length()-1 )+"ci";
				  }
				      else if(object.get(index3).endsWith("uç") ){
				   
				   return object.get(index3).substring(0,object.get(index3).length()-1 ) + "cu";
				  }
				  
				  else{
				   return object.get(index3);
				  }
			
		}
		

	        @Override
			public String controll(){
			
			if(subject.get(randomindex).equals("Ben")){
					
			 if(String.valueOf(verb.get(randomindex1).charAt(verb.get(randomindex1).length()-1)).equals("ü"))
					  return  verb.get(randomindex1)  +"rüm";
					  
			  
			      else if(String.valueOf(verb.get(randomindex1).charAt(verb.get(randomindex1).length()-1)).equals("u")||
						  String.valueOf(verb.get(randomindex1).charAt(verb.get(randomindex1).length()-1)).equals("o"))
					   return verb.get(randomindex1)  +"rum";
					  
				   else if(String.valueOf(verb.get(randomindex1).charAt(verb.get(randomindex1).length()-1)).equals("e") || 
						  String.valueOf(verb.get(randomindex1).charAt(verb.get(randomindex1).length()-1)).equals("i")) 
					   return verb.get(randomindex1)  + "rim";
				  
				   else if(String.valueOf(verb.get(randomindex1).charAt(verb.get(randomindex1).length()-1)).equals("i"))
						  return verb.get(randomindex1)  + "rim";
				  
				   else if(String.valueOf(verb.get(randomindex1).charAt(verb.get(randomindex1).length()-1)).equals("a"))
					    return verb.get(randomindex1)  + "rým";
				   
			
				   
				   else if(String.valueOf(verb.get(randomindex1).charAt(verb.get(randomindex1).length()-1)).equals("l")){
					   if(String.valueOf(verb.get(randomindex1).charAt(verb.get(randomindex1).length()-2)).equals("e"))
					    return  verb.get(randomindex1)  + "irim";
				  
				  
				else if(String.valueOf(verb.get(randomindex1).charAt(verb.get(randomindex1).length()-2)).equals("o"))
					    return  verb.get(randomindex1)  + "urum";
					    
					 else if(String.valueOf(verb.get(randomindex1).charAt(verb.get(randomindex1).length()-2)).equals("ö"))
						return verb.get(randomindex1)  + "ürüm";
				  
				  }
				  
				   else if(String.valueOf(verb.get(randomindex1).charAt(verb.get(randomindex1).length()-1)).equals("r")){
					  if(String.valueOf(verb.get(randomindex1).charAt(verb.get(randomindex1).length()-2)).equals("ö"))
					    return  verb.get(randomindex1)  + "ürüm";
					  
					  else if(String.valueOf(verb.get(randomindex1).charAt(verb.get(randomindex1).length()-2)).equals("a"))
						   return  verb.get(randomindex1)  + "ýrýrým";
					  
					 
				  
				  else if(String.valueOf(verb.get(randomindex1).charAt(verb.get(randomindex1).length()-2)).equals("e") || 
						  String.valueOf(verb.get(randomindex1).charAt(verb.get(randomindex1).length()-2)).equals("i"))
					  return verb.get(randomindex1)  + "irim";
				  
				    }
				   
				   else if(String.valueOf(verb.get(randomindex1).charAt(verb.get(randomindex1).length()-1)).equals("v")){
					   if(String.valueOf(verb.get(randomindex1).charAt(verb.get(randomindex1).length()-2)).equals("e"))
					   return verb.get(randomindex1)  + "erim";
				      
				    }
				   
				   else if(String.valueOf(verb.get(randomindex1).charAt(verb.get(randomindex1).length()-1)).equals("ð")){
					   if(String.valueOf(verb.get(randomindex1).charAt(verb.get(randomindex1).length()-2)).equals("o"))
					    return verb.get(randomindex1)  + "arým";
				  
				      }
			 
					  else if(String.valueOf(verb.get(randomindex1).charAt(verb.get(randomindex1).length()-1)).equals("s")){
						  if(String.valueOf(verb.get(randomindex1).charAt(verb.get(randomindex1).length()-2)).equals("e"))
						  {
							  return verb.get(randomindex1) + "erim";
						  }
						  
						   
						  
					  }

				 
				
				
			}
			else if(subject.get(randomindex).equals("Sen")){
					
					  if(String.valueOf(verb.get(randomindex1).charAt(verb.get(randomindex1).length()-1)).equals("ü"))
						  return  verb.get(randomindex1)  +"rsün";
						  
				  
					  else if(String.valueOf(verb.get(randomindex1).charAt(verb.get(randomindex1).length()-1)).equals("u"))
						  return verb.get(randomindex1)  +"rsun";
						  
					   else if(String.valueOf(verb.get(randomindex1).charAt(verb.get(randomindex1).length()-1)).equals("e")) 
						 return  verb.get(randomindex1)  + "rsin";
					  
					   else if(String.valueOf(verb.get(randomindex1).charAt(verb.get(randomindex1).length()-1)).equals("i"))
							  return verb.get(randomindex1)  + "rim";
					  
					   else  if(String.valueOf(verb.get(randomindex1).charAt(verb.get(randomindex1).length()-1)).equals("a"))
						 return verb.get(randomindex1)  + "rsýn";
					   
					
					   
					   else if(String.valueOf(verb.get(randomindex1).charAt(verb.get(randomindex1).length()-1)).equals("l")){
					    if(String.valueOf(verb.get(randomindex1).charAt(verb.get(randomindex1).length()-2)).equals("e"))
						   return  verb.get(randomindex1)  + "irsin";
					  
					  
						   else if(String.valueOf(verb.get(randomindex1).charAt(verb.get(randomindex1).length()-2)).equals("o"))
						    return verb.get(randomindex1)  + "ursun";
						    
						    else if(String.valueOf(verb.get(randomindex1).charAt(verb.get(randomindex1).length()-2)).equals("ö"))
							return  verb.get(randomindex1)  + "ürsün";
					  
					  }
					  
					   else if(String.valueOf(verb.get(randomindex1).charAt(verb.get(randomindex1).length()-1)).equals("r")){
						  if(String.valueOf(verb.get(randomindex1).charAt(verb.get(randomindex1).length()-2)).equals("ö"))
						   return  verb.get(randomindex1)  + "ürsün";
						  
						  else if(String.valueOf(verb.get(randomindex1).charAt(verb.get(randomindex1).length()-2)).equals("a"))
							   return  verb.get(randomindex1)  + "ýrýrsýn";
						  
						  
						  else  if(String.valueOf(verb.get(randomindex1).charAt(verb.get(randomindex1).length()-2)).equals("e") ||
								  String.valueOf(verb.get(randomindex1).charAt(verb.get(randomindex1).length()-2)).equals("i"))
						    return verb.get(randomindex1)  + "irsin";
					  }
					
					  
					    
					   
					   else if(String.valueOf(verb.get(randomindex1).charAt(verb.get(randomindex1).length()-1)).equals("v")){
						   if(String.valueOf(verb.get(randomindex1).charAt(verb.get(randomindex1).length()-2)).equals("e"))
						   return verb.get(randomindex1)  + "ersin";
					      
					    }
					   
					   else if(String.valueOf(verb.get(randomindex1).charAt(verb.get(randomindex1).length()-1)).equals("ð")){
						   if(String.valueOf(verb.get(randomindex1).charAt(verb.get(randomindex1).length()-2)).equals("o"))
						   return verb.get(randomindex1)  + "arsýn";
					  
					      }
					  
						  else if(String.valueOf(verb.get(randomindex1).charAt(verb.get(randomindex1).length()-1)).equals("s")){
							  if(String.valueOf(verb.get(randomindex1).charAt(verb.get(randomindex1).length()-2)).equals("e"))
							  {
								  return verb.get(randomindex1) + "ersin";
							  }
							  
							   
							  
						  }
					   
					 }
				
				
				
				 else if(subject.get(randomindex).equals("Biz")){
					
				    if(String.valueOf(verb.get(randomindex1).charAt(verb.get(randomindex1).length()-1)).equals("ü"))
						return verb.get(randomindex1)  +"rüz";
						  
				  
					  else if(String.valueOf(verb.get(randomindex1).charAt(verb.get(randomindex1).length()-1)).equals("u")||
							  String.valueOf(verb.get(randomindex1).charAt(verb.get(randomindex1).length()-1)).equals("o"))
						  return verb.get(randomindex1)  +"ruz";
						  
					   else if(String.valueOf(verb.get(randomindex1).charAt(verb.get(randomindex1).length()-1)).equals("e") || 
							  String.valueOf(verb.get(randomindex1).charAt(verb.get(randomindex1).length()-1)).equals("i")) 
						 return  verb.get(randomindex1)  + "riz";
					  
					   else if(String.valueOf(verb.get(randomindex1).charAt(verb.get(randomindex1).length()-1)).equals("i"))
							 return subject.get(randomindex) +" " + verb.get(randomindex1)  + "riz";
					  
					   else if(String.valueOf(verb.get(randomindex1).charAt(verb.get(randomindex1).length()-1)).equals("a"))
						   return  verb.get(randomindex1)  + "rýz";
					   
					
					   
					   else if(String.valueOf(verb.get(randomindex1).charAt(verb.get(randomindex1).length()-1)).equals("l")){
						   if(String.valueOf(verb.get(randomindex1).charAt(verb.get(randomindex1).length()-2)).equals("e"))
						    return verb.get(randomindex1)  + "iriz";
					  
					  
						   else if(String.valueOf(verb.get(randomindex1).charAt(verb.get(randomindex1).length()-2)).equals("o"))
						    return  verb.get(randomindex1)  + "uruz";
						    
						    else if(String.valueOf(verb.get(randomindex1).charAt(verb.get(randomindex1).length()-2)).equals("ö"))
							return  verb.get(randomindex1)  + "ürüz";
					  
					  }
					  
					   else if(String.valueOf(verb.get(randomindex1).charAt(verb.get(randomindex1).length()-1)).equals("r")){
						  if(String.valueOf(verb.get(randomindex1).charAt(verb.get(randomindex1).length()-2)).equals("ö"))
						    return  verb.get(randomindex1)  + "ürüz";
						  
						  else if(String.valueOf(verb.get(randomindex1).charAt(verb.get(randomindex1).length()-2)).equals("a"))
							   return  verb.get(randomindex1)  + "ýrýrýz";
						  
						  
						  else if(String.valueOf(verb.get(randomindex1).charAt(verb.get(randomindex1).length()-2)).equals("e") ||
								  String.valueOf(verb.get(randomindex1).charAt(verb.get(randomindex1).length()-2)).equals("i")){
						   return  verb.get(randomindex1)  + "iriz";
					  }
					  
					
					    }
					   
					   else if(String.valueOf(verb.get(randomindex1).charAt(verb.get(randomindex1).length()-1)).equals("v")){
						   if(String.valueOf(verb.get(randomindex1).charAt(verb.get(randomindex1).length()-2)).equals("e"))
						    return  verb.get(randomindex1)  + "eriz";
					      
					    }
					   
					   else if(String.valueOf(verb.get(randomindex1).charAt(verb.get(randomindex1).length()-1)).equals("ð")){
						   if(String.valueOf(verb.get(randomindex1).charAt(verb.get(randomindex1).length()-2)).equals("o"))
						    return  verb.get(randomindex1)  + "arýz";
					  
					      }
					
					 }
				
				   else if(subject.get(randomindex).equals("Siz")){
					
				    if(String.valueOf(verb.get(randomindex1).charAt(verb.get(randomindex1).length()-1)).equals("ü"))
						  return  verb.get(randomindex1)  +"rsünüz";
						  
				  
					  else if(String.valueOf(verb.get(randomindex1).charAt(verb.get(randomindex1).length()-1)).equals("u"))
						  return  verb.get(randomindex1)  +"rsunuz";
						  
					  else if(String.valueOf(verb.get(randomindex1).charAt(verb.get(randomindex1).length()-1)).equals("e"))
						  return  verb.get(randomindex1)  + "rsiniz";
					  
					  
					  else if(String.valueOf(verb.get(randomindex1).charAt(verb.get(randomindex1).length()-1)).equals("a"))
						  return verb.get(randomindex1)  + "rsýnýz";
					   
					
					   
					  else if(String.valueOf(verb.get(randomindex1).charAt(verb.get(randomindex1).length()-1)).equals("l")){
						   if(String.valueOf(verb.get(randomindex1).charAt(verb.get(randomindex1).length()-2)).equals("e"))
						    return verb.get(randomindex1)  + "irsiniz";
					  
					  
					      else if(String.valueOf(verb.get(randomindex1).charAt(verb.get(randomindex1).length()-2)).equals("o"))
						    return  verb.get(randomindex1)  + "ursunuz";
						    
						    else if(String.valueOf(verb.get(randomindex1).charAt(verb.get(randomindex1).length()-2)).equals("ö"))
							return verb.get(randomindex1)  + "ürsünüz";
					  
					  }
					  
					  else if(String.valueOf(verb.get(randomindex1).charAt(verb.get(randomindex1).length()-1)).equals("r")){
						  if(String.valueOf(verb.get(randomindex1).charAt(verb.get(randomindex1).length()-2)).equals("ö"))
						   return  verb.get(randomindex1)  + "ürsünüz";
						  
						  else if(String.valueOf(verb.get(randomindex1).charAt(verb.get(randomindex1).length()-2)).equals("a"))
							   return  verb.get(randomindex1)  + "ýrsýnýz";
						  
						  
						  else if(String.valueOf(verb.get(randomindex1).charAt(verb.get(randomindex1).length()-2)).equals("e") ||
								  String.valueOf(verb.get(randomindex1).charAt(verb.get(randomindex1).length()-2)).equals("i"))
						  return verb.get(randomindex1)  + "irsiniz";
					  }
					  
						
					  
					    
					   
					  else if(String.valueOf(verb.get(randomindex1).charAt(verb.get(randomindex1).length()-1)).equals("v")){
						   if(String.valueOf(verb.get(randomindex1).charAt(verb.get(randomindex1).length()-2)).equals("e"))
						return	verb.get(randomindex1)  + "ersiniz";
					      
					    }
					   
					  else if(String.valueOf(verb.get(randomindex1).charAt(verb.get(randomindex1).length()-1)).equals("ð")){
						   if(String.valueOf(verb.get(randomindex1).charAt(verb.get(randomindex1).length()-2)).equals("o"))
						    return verb.get(randomindex1)  + "arsýnýz";
					  
					      }
				    
					  else if(String.valueOf(verb.get(randomindex1).charAt(verb.get(randomindex1).length()-1)).equals("s")){
						  if(String.valueOf(verb.get(randomindex1).charAt(verb.get(randomindex1).length()-2)).equals("e"))
						  {
							  return verb.get(randomindex1) + "ersiniz";
						  }
						  
						   
						  
					  }
				    
				    
				    
				    
					   
					  
					 }
				
				else{
					
				 if(String.valueOf(verb.get(randomindex1).charAt(verb.get(randomindex1).length()-1)).equals("ü"))
						  return verb.get(randomindex1)  +"r";
						  
				  
					  else if(String.valueOf(verb.get(randomindex1).charAt(verb.get(randomindex1).length()-1)).equals("u")||
							  String.valueOf(verb.get(randomindex1).charAt(verb.get(randomindex1).length()-1)).equals("o"))
						  return  verb.get(randomindex1)  +"r";
						  
					  else if(String.valueOf(verb.get(randomindex1).charAt(verb.get(randomindex1).length()-1)).equals("e") || 
							  String.valueOf(verb.get(randomindex1).charAt(verb.get(randomindex1).length()-1)).equals("i")) 
						  return verb.get(randomindex1)  + "r";
					  
					  else if(String.valueOf(verb.get(randomindex1).charAt(verb.get(randomindex1).length()-1)).equals("i"))
							  return  verb.get(randomindex1)  + "r";
					  
					  else if(String.valueOf(verb.get(randomindex1).charAt(verb.get(randomindex1).length()-1)).equals("a"))
						   return verb.get(randomindex1)  + "r";
					   
					
					   
					  else if(String.valueOf(verb.get(randomindex1).charAt(verb.get(randomindex1).length()-1)).equals("l")){
					  if(String.valueOf(verb.get(randomindex1).charAt(verb.get(randomindex1).length()-2)).equals("e"))
						    return  verb.get(randomindex1)  + "ir";
					  
					  
					  else if(String.valueOf(verb.get(randomindex1).charAt(verb.get(randomindex1).length()-2)).equals("o"))
						    return verb.get(randomindex1)  + "ur";
						    
						    else if(String.valueOf(verb.get(randomindex1).charAt(verb.get(randomindex1).length()-2)).equals("ö"))
							return verb.get(randomindex1)  + "ür";
					  
					  }
					  
					  else if(String.valueOf(verb.get(randomindex1).charAt(verb.get(randomindex1).length()-1)).equals("r")){
						  if(String.valueOf(verb.get(randomindex1).charAt(verb.get(randomindex1).length()-2)).equals("ö"))
						    return verb.get(randomindex1)  + "ür";
						  
						  
						  else if(String.valueOf(verb.get(randomindex1).charAt(verb.get(randomindex1).length()-2)).equals("e") ||
								  String.valueOf(verb.get(randomindex1).charAt(verb.get(randomindex1).length()-2)).equals("i"))
						   return verb.get(randomindex1)  + "ir";
					  }
				 
					  else if(String.valueOf(verb.get(randomindex1).charAt(verb.get(randomindex1).length()-1)).equals("s")){
						  if(String.valueOf(verb.get(randomindex1).charAt(verb.get(randomindex1).length()-2)).equals("e"))
						  {
							  return verb.get(randomindex1) + "er";
						  }
						  
						   
						  
					  }
					  
						
					  
					    
					   
					  else if(String.valueOf(verb.get(randomindex1).charAt(verb.get(randomindex1).length()-1)).equals("v")){
						   if(String.valueOf(verb.get(randomindex1).charAt(verb.get(randomindex1).length()-2)).equals("e"))
						   return  verb.get(randomindex1)  + "er";
					      
					    }
					   
					  else if(String.valueOf(verb.get(randomindex1).charAt(verb.get(randomindex1).length()-1)).equals("ð")){
						   if(String.valueOf(verb.get(randomindex1).charAt(verb.get(randomindex1).length()-2)).equals("o"))
						  return  verb.get(randomindex1)  + "ar";
					  
					      }
					   
					
					 }
			return verb.get(randomindex1)  + "ar";
			
			
				
			}

			

			
			
			public String toString(int random)
			{
				
			
					  if(random==1){
					  firstSentence+=subject.get(randomindex) + " " + controll();
					  System.out.println(random);
					  return firstSentence;
					  
					  }
					  if(random==2){
					   secondSentence += adjective.get(randomindex2) + " "  +controll()+ " "+subject.get(randomindex) + " ";
					   System.out.println(random);
					  return secondSentence;
					 
					 }
					  
					  if(random==3)
					   {
						  thirdSentence+=subject.get(randomindex) +"  " + adverb.get(randomindex4) +"  " +controll();
						  System.out.println(random);
						   return thirdSentence;
						
					   }
					  
					  if(random==4)
					   {
						  fourthSentence+=subject.get(randomindex) +"  " + adverb.get(randomindex4) +"  " +controll();
						  System.out.println(random);
						   return fourthSentence;
						
					   }
					  
					  
					  return fourthSentence;
					  
			
			 


			}
			

}
				
				
				
			
			
			
			
				
				
				

	        
	       
			
			

		
	
	  


