package aravind.apps;

class Startriangle
{
public static void main(String[] args) 
{
int i,j,k;
for(i=1; i<=5; i++)
{
for(j=4; j>=i; j--)
{
System.out.print(" ");
}
for(k=1; k<=(2*i-1); k++)
{
System.out.print("*");
}
System.out.println("");
}
}
}


/*

under main 

try{
intnnooflines=Integer.parseInt(args[0]);
for(int linenumber=1;linenumber<=nofoflines;linenumber++){

for(int linenumber=1;linenumber<=linenumber;linenumber++){

}

*/