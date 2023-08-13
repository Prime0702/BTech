//@ requires y<-1 || y==0;
void fun(int y){
    int x;
    if (y<0){
        x=y+1;
    }else{
        x=y-1;
    }
    //@ assert x<0;
}