    li $t2, 0
    li $t0, 8
LOOP:
    bge $t0, $zero, END
    add $t2, $t2, $t0
    j LOOP
END:
    jr $ra