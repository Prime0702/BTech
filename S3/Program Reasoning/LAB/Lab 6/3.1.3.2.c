//@ ensures (a<b ==> b-a)|| (a>=b ==> a-b);
int distance(int a, int b){
    if (a<b)
        return b-a;
    else
        return a-b;
}