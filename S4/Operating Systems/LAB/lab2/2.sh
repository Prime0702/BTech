#!/bin/sh
echo "start"
cat >numericdata<<EOF
Karunagappally  34567 7864 6785
Kollam    56754  6754 7654
Vallikkavu  54328 7548 45675
Trivandrum 16423 6654  6754
Ernakulam  28796  8549  9875
Kayamkulam 35589 75892 3451
kottayam  45557 6773 6547
tirukulum 45675 56476 7896
EOF
echo "Q.a. Done"
echo "Q.b."
cat numericdata | cut -d " " -f 1 | grep ^T
echo "Q.c."
cat numericdata | tr -s " " | grep -i ^k | cut -d " " -f 4 | sort -n
echo "Q.d."
cat numericdata | tr -s " " | cut -d " " -f 3 | grep ^6.*4$
echo "Q.e."
cat numericdata | tr -s " " | cut -d " " -f 3 | grep 6
echo "Q.f."
cat numericdata | tr -s " " | cut -d " " -f 2 | grep 5
echo "end"
