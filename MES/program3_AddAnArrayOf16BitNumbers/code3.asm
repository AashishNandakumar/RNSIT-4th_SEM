	AREA  ADD_NOS_FROM_ARRAY, CODE, READONLY
ENTRY
	MOV R0, #0 ;HOLDS THE SUM
	LDR R1, =TABLE
	MOV R2, #6 ; HOLDS THE LENGTH OF ARRAY
	LDR R4, =RES
LOOP
	LDRH R3, [R1], #2
	ADD R0, R0, R3
	SUBS R2, R2, #1
	BNE LOOP
	STR R0, [R4]
STOP B STOP
	
TABLE 
	DCD 0X1111, 0X2222, 0X3333, 0X4444, 0X5555, 0X6666
	AREA DATA1, DATA, READWRITE
RES 
	DCD 0X0
	END