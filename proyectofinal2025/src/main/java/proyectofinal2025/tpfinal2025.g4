grammar tpfinal2025;

@header { 
package proyectofinal2025;
}

fragment LETRA: [A-Za-z];
fragment DIGITO: [0-9];

// Reglas de simbolos
LLAVE_APER: '{';
LLAVE_CIER: '}';
PAR_APER: '(';
PAR_CIER: ')';

// Reglas de operadores matematicos
MAS: '+';
MENOS: '-';
MULTI: '*';
DIVIS: '/';

// Reglas de operadores logicos
MENOR: '<';
MAYOR: '>';
MENOR_IGUAL: '<=';
MAYOR_IGUAL: '>=';
IGUALDAD: '==';
DIFERENTE: '!=';

AND: '&&';
OR: '||';

// Separadores
COMA: ',';
PUNTO_COMA: ';';

// Regla para asignacion
ASIGNACION: '='; 

//Palabras reservadas de tipos de C
INT: 'int';
FLOAT: 'float';
DOUBLE: 'double';
VOID: 'void';

// Estructuras de control
CTRL_IF: 'if';
CTRL_WHILE: 'while';
CTRL_FOR: 'for';
CTRL_RETURN: 'return';

// Identificadores
NRO_ENTERO: DIGITO+;
NRO_DECIMAL: NRO_ENTERO'.'NRO_ENTERO;

ID: (LETRA | '_')(LETRA | DIGITO | '_')*;

//Descarte de espacios en blanco
WS: ([ \n\t\r]+) -> skip;

// Inicio de reglas programa
programa: instrucciones;

// Definicion de recursiva de las instrucciones del programa
instrucciones: instruccion instrucciones
             |
             ;

// Definicion de instruccion con todas sus sub-reglas
instruccion: asignacion PUNTO_COMA
           | bloque
           | declaracion PUNTO_COMA
           | declarar_funcion  PUNTO_COMA
           | definir_funcion
           | estructura_if
           | estructura_while
           | estructura_for
           | llamar_funcion PUNTO_COMA
           | retorno PUNTO_COMA
           ;

// Definiciones de los tipos de instruccion a parsear

// Asignaciones de variables
asignacion: ID ASIGNACION operacion_al;

// Definicion de bloque que definira un nuevo contexto
bloque: LLAVE_APER instrucciones LLAVE_CIER;

// Declaraciones de variables numericas
declaracion: tipo_de_dato ID declaracion_multiple;

declaracion_multiple: ASIGNACION (ID | NRO_ENTERO) declaracion_multiple
                    | COMA ID declaracion_multiple
                    |
                    ;

// Declaracion de una funcion
declarar_funcion: tipo_de_funcion ID PAR_APER parametros_de_funcion PAR_CIER;

// Definicion del cuerpo de una funcion
definir_funcion: tipo_de_funcion ID PAR_APER parametros_de_funcion PAR_CIER bloque;

// Definicion de un if
estructura_if: CTRL_IF PAR_APER comparacion PAR_CIER bloque;

// Definicion de un ciclo while
estructura_while: CTRL_WHILE PAR_APER comparacion PAR_CIER bloque;

// Definicion de un ciclo for
estructura_for: CTRL_FOR struct_for bloque;

// Llamada a una funcion
llamar_funcion: ID PAR_APER argumentos_de_funcion PAR_CIER;

// Retornar un valor
retorno: CTRL_RETURN (termino | );


// -------------------- [REGLAS AUXILIARES] --------------------

// Tipos de datos para variables numericas
tipo_de_dato: INT
            | FLOAT
            | DOUBLE
            ;

// Auxiliares para el manejo de operaciones aritmeticas
operacion_al: expresion;

expresion: termino e;

// Sumas y restas
e: MAS termino e
 | MENOS termino e
 |
 ;

// Multiplicacion y division
termino: factor t;

t: MULTI factor t
 | DIVIS factor t
 |    
 ;

factor: ID
      | NRO_ENTERO
      | NRO_DECIMAL
      | PAR_APER expresion PAR_CIER
      ;

// Auxiliar para las declaracion/definicion de funciones
tipo_de_funcion: (tipo_de_dato | VOID);

// Manejo de parametros de funcion
parametros_de_funcion: tipo_de_dato ID parametro
                     |
                     ;

parametro: COMA tipo_de_dato ID parametro
         |
         ;
                     
// Definicion auxiliares para las estructuras de control
comparacion: (ID | NRO_ENTERO) operador_comparacion comparacion
           | (ID | NRO_ENTERO) operador_logico comparacion
           | (ID | NRO_ENTERO)
           ;

operador_comparacion: MENOR
                    | MAYOR
                    | MENOR_IGUAL
                    | MAYOR_IGUAL
                    | IGUALDAD
                    | DIFERENTE
                    ;

operador_logico: AND
               | OR
               ;

struct_for: PAR_APER ((ID | declaracion) PUNTO_COMA comparacion PUNTO_COMA incrementar_decrementar) PAR_CIER;

incrementar_decrementar: incrementar
                       | decrementar
                       ;

incrementar: ID MAS MAS
           | MAS MAS ID
           ;

decrementar: ID MENOS MENOS
           | MENOS MENOS ID
           ;

// Definicion auxiliares para llamado de funciones
argumentos_de_funcion: (ID | NRO_ENTERO)
                     |
                     ;

argumento: COMA (ID | NRO_ENTERO) argumento
         |
         ;

                     