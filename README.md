# README – Ejercicios de fundamentos de Álgebra 

Documnetacion de los ejercicios de matrices Álgebra 

---

## **Ejercicio 1: Determinante de una matriz 2×2**

Dada la matriz:

[ A = \begin{pmatrix} a & b \ c & d \end{pmatrix} ]
El determinante se calcula como:

[ \det(A) = ad - bc ]

---

## **Ejercicio 2: Suma, resta y multiplicación de matrices**

Dadas las matrices:
[
A = \begin{pmatrix} 2 & 1 \ 1 & 3 \end{pmatrix}, \quad
B = \begin{pmatrix} 1 & 2 \ 3 & 1 \end{pmatrix}
]

### **A + B**

Se suman elemento a elemento:
[
A + B = \begin{pmatrix} 3 & 3 \ 4 & 4 \end{pmatrix}
]

### **A − B**

[
A - B = \begin{pmatrix} 1 & -1 \ -2 & 2 \end{pmatrix}
]

### **Multiplicación AB**

[
AB = \begin{pmatrix}
(2)(1) + (1)(3) & (2)(2) + (1)(1) \
(1)(1) + (3)(3) & (1)(2) + (3)(1)
\end{pmatrix}
= \begin{pmatrix} 5 & 5 \ 10 & 5 \end{pmatrix}
]

---

## **Ejercicio 3: Determinante de AB, A y B**

### **Determinante de A**

[
\det(A) = (2)(3) - (1)(1) = 6 - 1 = 5
]

### **Determinante de B**

[
\det(B) = (1)(1) - (2)(3) = 1 - 6 = -5
]

### **Determinante de AB**

Usando la matriz calculada:
[
AB = \begin{pmatrix} 5 & 5 \ 10 & 5 \end{pmatrix}
]
[
\det(AB) = (5)(5) - (5)(10) = 25 - 50 = -25
]

### **Verificación de la propiedad**

[
\det(AB) = \det(A)\cdot\det(B)
]
[
-25 = (5)(-5)
]
✔ **Propiedad verificada**

---

## **Ejercicio 4: Det(Aᵀ)**

La matriz transpuesta de A es:
[
A^T = \begin{pmatrix} 2 & 1 \ 1 & 3 \end{pmatrix}
]
Es igual a la original, por lo tanto:
[
\det(A^T) = \det(A) = 5
]
✔ **Propiedad verificada**

---

## **Ejercicio 5: Aplicación geométrica con vectores**

Dado:
[
\vec{u} = (3,2), \quad \vec{v} = (1,4)
]

El área del paralelogramo es:
[
|\det\begin{pmatrix} 3 & 1 \ 2 & 4 \end{pmatrix}| = |(3)(4)-(1)(2)| = |12 - 2| = 10
]
✔ **Área = 10 unidades²**

### **b) ¿Cambia si se intercambian los vectores?**

[
\det\begin{pmatrix} 1 & 3 \ 4 & 2 \end{pmatrix} = (1)(2)-(3)(4) = 2 - 12 = -10
]
El valor cambia de signo, pero el **área = |det| = 10** sigue siendo la misma.

### **c) Interpretación del signo**

El signo indica orientación:

* **Positivo** → orientación antihoraria.
* **Negativo** → orientación horaria.

El área siempre se toma en valor absoluto.

---

## **Conclusión General**

En estos ejercicios se aplicaron propiedades fundamentales de matrices y determinantes:

* El determinante del producto es el producto de determinantes.
* El determinante no cambia al transponer una matriz.
* El determinante de dos vectores en R² representa el **área** del paralelogramo.
* El signo del determinante indica **orientación**, no afecta al área.

Con esto se confirma cómo los determinantes conectan álgebra lineal con geometría.
