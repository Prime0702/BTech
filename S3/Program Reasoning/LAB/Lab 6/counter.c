struct Counter{
    int seconds;
};
struct Counter c; // global

/*@
    behavior one:
        assumes 0 <= c.seconds < 59;
        ensures c.seconds == \old(c.seconds) + 1;
    behavior two:
        assumes c.seconds == 59;
        ensures c.seconds == 0;
*/
void tick(){
    c.seconds = (c.seconds + 1) % 60;
}