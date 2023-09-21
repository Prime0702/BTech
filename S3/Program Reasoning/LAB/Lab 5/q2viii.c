int fun(){
    int x = 5;
    //@ assert x>=0;
    x++;
    //@ assert x>0;
    return x;
}