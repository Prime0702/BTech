//@ requires y>=0 && x>0;
void fun(int x, int y){
    if (y<0){
        x=y+1;
    }
    //@ assert x>0;
}