Public class specialchar{
Public static void (string args[]){

String str ="abcd@#$"; 

Int count =0; 
for(int i =0; i<str.length(); i++){

If(!Character.isDigit(str.charAt(i)) && If(!Character.isLetter(str.charAt(i)) && If(!Character.isWhitespace(str.charAt(i)))
{
Count++;
}

}
If(i==0)
{
System.out.println("no special character found !  ");
}else{  
System.out.println("  special character found " + count);
}

}



}
