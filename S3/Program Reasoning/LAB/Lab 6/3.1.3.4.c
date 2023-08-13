/*@
    requires 1 <= month <= 12;
    assigns \nothing;
    behavior february:
        assumes month \in { 2 };
        ensures \result == 28;
    behavior thirty:
        assumes month \in { 4, 6, 9, 11 };
        ensures \result == 30;
    behavior thirty_one:
        assumes month \in { 1, 3, 5, 7, 8, 10, 12 };
        ensures \result == 31;
    complete behaviors;
    disjoint behaviors;
*/
int day_of(int month){
    int days[]={31,28,31,30,31,30,31,31,30,31,30,31};
    return days[month-1];
}