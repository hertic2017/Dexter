package bodymass;


public class massext {
float massext;
float calculate(float weight, float height){
	

if (massext < 18.5){
	System.out.println("underweight");
}
else if(massext >=18.5 && massext <=24.9){
	System.out.println("healthyweight");
}
else if(massext>=25 && massext<=29){
	System.out.println("overweight");
}
else if (massext>=30){
	System.out.println("obese");
}

return massext =(weight)/(height*height);
}
}