	AREA SQ_OF_A_NO, CODE, READONLY
ENTRY
	MOV R0, #0
	MOV R1, #4   ;find the square of this no
	LDR R2, =LOOKUP
	LDRB R3, [R2, R1]
STOP B STOP
LOOKUP
	DCB 0,1,4,9,16,25,36,49,64,81,100
	END