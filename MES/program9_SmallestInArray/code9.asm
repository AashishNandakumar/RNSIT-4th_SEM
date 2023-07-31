	AREA  SMALLEST_IN_ARRAY, CODE, READONLY
ENTRY
	MOV R0, #5 ; STORES THE LENGTH OF THE ARRAY
	LDR R1, =TABLE
	LDR R2, [R1], #4
LOOP
	LDR R3, [R1], #4
	CMP R2, R3
	MOVHS R2, R3  ; MOVE IF HIGH FLAG IS SET
	SUBS R0, R0, #1
	BNE LOOP
STOP B STOP
TABLE
	DCD 0X6666, 0X5555, 0X4444, 0X3333, 0X2222, 0X1111
	END