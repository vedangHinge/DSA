public class heapSortWithoutRecursion{
public static void main(String gg[]){
int[] x={16,52,73,84,9,56,120,60,12,35};
int ci,ri,g,lci,rci,swi;
int y=1;
while(y<=9){
ci=y;
while(ci>0){
ri=(ci-1)/2;
if(x[ci]>x[ri]){
g=x[ri];
x[ri]=x[ci];
x[ci]=g;
ci=ri;
}
else{
break;
}
}
y++;
}
y=9;
while(y>0){
g=x[0];
x[0]=x[y];
x[y]=g;
y--;
ri=0;
while(ri<y){
lci=(ri*2)+1;
if(lci>y) break;
rci=lci+1;
if(rci>y)swi=lci;
else{
if(x[lci]>x[rci]){
swi=lci;
}else swi=rci;
}
if(x[swi]>x[ri]){
g=x[swi];
x[swi]=x[ri];
x[ri]=g;
ri=swi;
}else{
break;
}
}
}
for(int i=0;i<=9;i++){
System.out.println(x[i]);
}
}

}