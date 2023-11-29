IF:
    bge		$t10, $zero, ESLE	
    sub     $s0, $zero, $t8
    addi    $t1, $t1, 2
    j       END
ESLE:
    move   $s0, $t8
    addi   $t2, $t2, 1
END:
    jr $ra