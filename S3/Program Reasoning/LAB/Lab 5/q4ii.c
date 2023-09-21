/*@
    requires z>-1;
*/
void fun(int z){
    int x=z+1;
    int y=x+5;
    //@ assert y>5;
}