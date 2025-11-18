# Ejercicios de Álgebra Lineal — Determinantes y Aplicaciones

Alumno: Euruviel Márquez Martínez  
Grupo: 2103-B

---

## Ejercicio 1: Determinantes 2×2

A continuación se calculan los determinantes de las siguientes matrices:

$$
\mathbf{A} =
\begin{pmatrix}
5 & 2 \\
3 & 1 \\
\end{pmatrix}
\qquad
\mathbf{B} =
\begin{pmatrix}
-1 & 4 \\
2 & -8 \\
\end{pmatrix}
\qquad
\mathbf{C} =
\begin{pmatrix}
6 & 9 \\
2 & 3 \\
\end{pmatrix}
\qquad
\mathbf{D} =
\begin{pmatrix}
0 & 5 \\
-5 & 0 \\
\end{pmatrix}
$$

## ✅ **Ejercicio 1.1 – Determinante de la matriz A**

### **Enunciado**

Calcular el determinante de:

$$ **A** =
\begin{pmatrix}
5 & 3 \\
2 & 1 \\
\end{pmatrix}
$$

### **Respuesta**

det(A)=-1


### **Procedimiento**

1. Multiplicar la diagonal principal:

   * (5 \cdot 1 = 5)
2. Multiplicar la diagonal secundaria:

   * (2 \cdot 3 = 6)
3. Aplicar la fórmula del determinante:

   * (5 - 6 = -1)

---

## ✅ **Ejercicio 1.2 – Determinante de la matriz B**

### **Enunciado**

$$ **B** =
\begin{pmatrix}
-1 & 4 \\
2 & -8 \\
\end{pmatrix}
$$

### **Respuesta**

det(B)=0


### **Procedimiento**

1. Diagonal principal:

   * ((-1)(-8)=8)
2. Diagonal secundaria:

   * (4 \cdot 2 = 8)
3. Restar:

   * (8 - 8 = 0)


---

## ✅ **Ejercicio 1.3 – Determinante de la matriz C**

### **Enunciado**

$$ **C** =
\begin{pmatrix}
6 & 9 \\
2 & 3 \\
\end{pmatrix}
$$
### **Respuesta**

det(C)=0


### **Procedimiento**

1. Diagonal principal:

   * (6 \cdot 3 = 18)
2. Diagonal secundaria:

   * (9 \cdot 2 = 18)
3. Restar:

   * (18 - 18 = 0)

---

## ✅ **Ejercicio 1.4 – Determinante de la matriz D**

### **Enunciado**

$$ **D** =
\begin{pmatrix}
0 & 5 \\
-5 & 0 \\
\end{pmatrix}
$$

### **Respuesta**

det(D)=25


### **Procedimiento**

1. Diagonal principal:

   * (0 \cdot 0 = 0)
2. Diagonal secundaria:

   * (5 \cdot (-5) = -25)
3. Restar:

   * (0 - (-25) = 25)





---

## Ejercicio 2: Regla de Sarrus (3×3)

Calcular los determinantes usando la **Regla de Sarrus** para las matrices:

$$
\mathbf{E} =
\begin{pmatrix}
1 & 2 & 3 \\
0 & 1 & 4 \\
5 & 6 & 0 \\
\end{pmatrix}
\qquad
\mathbf{F} =
\begin{pmatrix}
2 & -1 & 3 \\
1 & 4 & 0 \\
3 & 2 & -2 \\
\end{pmatrix}
$$



### Ejercicio 2.1 — Matriz **E** (Sarrus)

#### Procedimiento Sarrus
Escribir las dos primeras columnas a la derecha y multiplicar las diagonales:

Diagonales positivas:
- \(1\cdot 1 \cdot 0 = 0\)
- \(2\cdot 4 \cdot 5 = 40\)
- \(3\cdot 0 \cdot 6 = 0\)  
Suma positivas = \(0 + 40 + 0 = 40\)

Diagonales negativas:
- \(3\cdot 1 \cdot 5 = 15\)
- \(1\cdot 4 \cdot 6 = 24\)
- \(2\cdot 0 \cdot 0 = 0\)  
Suma negativas = \(15 + 24 + 0 = 39\)

Resultado:

det E = 40 - 39 = 1


---

### Ejercicio 2.2 — Matriz **F** (Sarrus)

#### Procedimiento Sarrus
Diagonales positivas:
- \(2\cdot 4 \cdot (-2) = -16\)
- \((-1)\cdot 0 \cdot 3 = 0\)
- \(3\cdot 1 \cdot 2 = 6\)  
Suma positivas = \(-16 + 0 + 6 = -10\)

Diagonales negativas:
- \(3\cdot 4 \cdot 3 = 36\)
- \(2\cdot 0 \cdot 2 = 0\)
- \((-1)\cdot 1 \cdot (-2) = 2\)  
Suma negativas = \(36 + 0 + 2 = 38\)

Resultado:

det F = (-10) - 38 = -48

---

## Ejercicio 3: Método de cofactores (3×3)

Calcular por expansión de cofactores:

$$
\mathbf{G} =
\begin{pmatrix}
1 & 0 & 2 \\
-1 & 3 & 1 \\
2 & 0 & 1 \\
\end{pmatrix}
$$

### Solución
Elegimos expandir por la **columna 2** (tiene ceros):

Sólo el elemento \(a_{2,2}=3\) aporta:

Menor asociado (eliminando fila 2 y columna 2):

\[
\begin{pmatrix}
1 & 2 \\
2 & 1 \\
\end{pmatrix}
\quad\Rightarrow\quad
(1)(1) - (2)(2) = 1 - 4 = -3
\]

Cofactor: \(C_{2,2} = (+) \cdot (-3) = -3\)  
Aporte total: \(3 \cdot (-3) = -9\)

Por tanto:
\[
\det(\mathbf{G}) = -9
\]

(Verificación por expansión por otra fila da el mismo resultado.)

---

## Ejercicio 4: Verificar propiedades del determinante

Dadas las matrices:

$$
\mathbf{A} =
\begin{pmatrix}
2 & 1 \\
1 & 3 \\
\end{pmatrix}
\qquad
\mathbf{B} =
\begin{pmatrix}
1 & 2 \\
3 & 1 \\
\end{pmatrix}
$$

### 1) Calcular \(\det(\mathbf{A})\) y \(\det(\mathbf{B})\)

\[
\det(\mathbf{A}) = (2)(3) - (1)(1) = 6 - 1 = 5
\]
\[
\det(\mathbf{B}) = (1)(1) - (2)(3) = 1 - 6 = -5
\]

### 2) Calcular \(AB\) y \(\det(AB)\)

\[
AB =
\begin{pmatrix}
2 & 1 \\
1 & 3 \\
\end{pmatrix}
\begin{pmatrix}
1 & 2 \\
3 & 1 \\
\end{pmatrix}
=
\begin{pmatrix}
5 & 5 \\
10 & 5 \\
\end{pmatrix}
\]
\[
\det(AB) = (5)(5) - (5)(10) = 25 - 50 = -25
\]

Verificación:
\[
\det(A)\cdot\det(B) = 5 \cdot (-5) = -25 = \det(AB)
\]

### 3) Verificar \(\det(A^T) = \det(A)\)

\[
A^T = A \quad\Rightarrow\quad \det(A^T) = \det(A) = 5
\]

**Conclusión:** Las propiedades solicitadas se verifican.

---

## Ejercicio 5: Aplicación geométrica (área)

Dados los vectores en \(\mathbb{R}^2\):

\[
\vec{u} = (3,2), \quad \vec{v} = (1,4)
\]

Formamos la matriz cuyas columnas son los vectores:

\[
M = \begin{pmatrix} 3 & 1 \\ 2 & 4 \end{pmatrix}
\]

### a) Área del paralelogramo
\[
\det(M) = (3)(4) - (1)(2) = 12 - 2 = 10
\]
\[
\text{Área} = |\det(M)| = 10
\]

### b) ¿Cambia el área si intercambiamos vectores?
Al intercambiar columnas:

\[
M' = \begin{pmatrix} 1 & 3 \\ 4 & 2 \end{pmatrix}
\quad\Rightarrow\quad
\det(M') = 2 - 12 = -10
\]
\[
|\det(M')| = 10
\]

El valor absoluto (área) **no cambia**; solo cambia el signo (orientación).

### c) ¿Qué representa el signo del determinante?
El signo indica la **orientación** (sentido) del par de vectores:
- Determinante positivo → orientación antihoraria.
- Determinante negativo → orientación horaria.

El área siempre se toma como el valor absoluto del determinante.

---

## Conclusión general
- Se aplicaron técnicas fundamentales: fórmula 2×2, Regla de Sarrus (3×3) y expansión por cofactores.  
- Verificamos propiedades algebraicas (multiplicativa y transposición).  
- Vimos la conexión geométrica del determinante con el área y la orientación.

---

## Referencias / Notas
- Si este README se va a ver en GitHub y deseas que las matrices aparezcan como en un visor LaTeX, puedo:
  - convertir las matrices a imágenes y agregarlas al README, o
  - reemplazar los bloques LaTeX por un formato ASCII/Markdown 100% compatible con GitHub.

Indícame qué prefieres y lo ajusto.





















































# 📘 Álgebra Lineal – Ejercicio 1: Determinantes 2×2

## 👨‍🏫 Información del Estudiante

* **Nombre:** Euruviel Márquez Martínez
* **Grupo:** 2103-B
* **Materia:** Álgebra Lineal

---

## 📋 Descripción del Ejercicio

En este documento se presenta la **resolución completa del Ejercicio 1**, donde se calculan los determinantes de matrices 2×2 utilizando la fórmula general:

[
\det(A)=ad-bc
]

Cada inciso incluye:

* Enunciado del problema
* Solución o respuesta final
* Procedimiento paso a paso

---

# 🔢 **Ejercicio 1: Determinantes 2×2**

A continuación se calculan los determinantes de las siguientes matrices:

[
A=\begin{pmatrix} 5 & 2 \ 3 & 1 \end{pmatrix}, \quad
B=\begin{pmatrix} -1 & 4 \ 2 & -8 \end{pmatrix}, \quad
C=\begin{pmatrix} 6 & 9 \ 2 & 3 \end{pmatrix}, \quad
D=\begin{pmatrix} 0 & 5 \ -5 & 0 \end{pmatrix}
]

---

## ✅ **Ejercicio 1.1 – Determinante de la matriz A**

### **Enunciado**

Calcular el determinante de:
[
A=\begin{pmatrix} 5 & 2 \ 3 & 1 \end{pmatrix}
]

### **Respuesta**

[
\det(A)=-1
]

### **Procedimiento**

1. Multiplicar la diagonal principal:

   * (5 \cdot 1 = 5)
2. Multiplicar la diagonal secundaria:

   * (2 \cdot 3 = 6)
3. Aplicar la fórmula del determinante:

   * (5 - 6 = -1)

---

## ✅ **Ejercicio 1.2 – Determinante de la matriz B**

### **Enunciado**

[
B=\begin{pmatrix} -1 & 4 \ 2 & -8 \end{pmatrix}
]

### **Respuesta**

[
\det(B)=0
]

### **Procedimiento**

1. Diagonal principal:

   * ((-1)(-8)=8)
2. Diagonal secundaria:

   * (4 \cdot 2 = 8)
3. Restar:

   * (8 - 8 = 0)

> *Nota:* Un determinante igual a cero indica que la matriz es **singular**.

---

## ✅ **Ejercicio 1.3 – Determinante de la matriz C**

### **Enunciado**

[
C=\begin{pmatrix} 6 & 9 \ 2 & 3 \end{pmatrix}
]

### **Respuesta**

[
\det(C)=0
]

### **Procedimiento**

1. Diagonal principal:

   * (6 \cdot 3 = 18)
2. Diagonal secundaria:

   * (9 \cdot 2 = 18)
3. Restar:

   * (18 - 18 = 0)

---

## ✅ **Ejercicio 1.4 – Determinante de la matriz D**

### **Enunciado**

[
D=\begin{pmatrix} 0 & 5 \ -5 & 0 \end{pmatrix}
]

### **Respuesta**

[
\det(D)=25
]

### **Procedimiento**

1. Diagonal principal:

   * (0 \cdot 0 = 0)
2. Diagonal secundaria:

   * (5 \cdot (-5) = -25)
3. Restar:

   * (0 - (-25) = 25)

> *Nota:* El determinante positivo indica preservación de orientación.

---

# 🔢 **Ejercicio 2: Determinante por Regla de Sarrus (Matrices 3×3)**

En este ejercicio se calculan los determinantes de dos matrices 3×3 utilizando la **Regla de Sarrus**, válida únicamente para matrices 3×3.

---

## ✅ **Ejercicio 2.1 – Determinante de la matriz E**

### **Enunciado**

E =
[ 1   2   3 ]
[ 0   1   4 ]
[ 5   6   0 ]

### **Respuesta**

**det(E) = 1**

### **Procedimiento (Regla de Sarrus)**

1. Extender la matriz copiando las dos primeras columnas al final.
2. **Diagonales positivas:**

   * 1·1·0 = 0
   * 2·4·5 = 40
   * 3·0·6 = 0
     **Suma positivas = 40**
3. **Diagonales negativas:**

   * 3·1·5 = 15
   * 1·4·6 = 24
   * 2·0·0 = 0
     **Suma negativas = 39**
4. **Resultado:** 40 − 39 = **1**

---

## ✅ **Ejercicio 2.2 – Determinante de la matriz F**

### **Enunciado**

F =
[  2  -1   3 ]
[  1   4   0 ]
[  3   2  -2 ]

### **Respuesta**

**det(F) = -48**

### **Procedimiento (Regla de Sarrus)**

1. Extender la matriz copiando las dos primeras columnas.
2. **Diagonales positivas:**

   * 2·4·(-2) = -16
   * (-1)·0·3 = 0
   * 3·1·2 = 6
     **Suma positivas = -10**
3. **Diagonales negativas:**

   * 3·4·3 = 36
   * 2·0·2 = 0
   * (-1)·1·(-2) = 2
     **Suma negativas = 38**
4. **Resultado:** (-10) − 38 = **-48**

---

# 🔢 **Ejercicio 3: Método de Cofactores (3×3)**

En este ejercicio se calcula el determinante de una matriz 3×3 usando **expansión por cofactores**.

## ✅ **Ejercicio 3 – Determinante de la matriz G**

### **Enunciado**

G =
[  1   0   2 ]
[ -1   3   1 ]
[  2   0   1 ]

### **Respuesta**

**det(G) = -9**

### **Procedimiento (Cofactores)**

Se elige la **columna 2** por contener ceros.

1. El único elemento no nulo es:

   * (a_{2,2} = 3)
2. Su menor se obtiene eliminando fila 2 y columna 2:

```
[ 1   2 ]
[ 2   1 ]
```

3. Determinante del menor:

   * (1·1) − (2·2) = 1 − 4 = -3
4. Cofactor:

   * signo positivo → C₂₂ = -3
5. Aporte:

   * 3 × (-3) = -9

Resultado final:
**det(G) = -9**

---

# 🔢 **Ejercicio 4: Verificación de Propiedades del Determinante**

Matrices dadas:
A =
[ 2   1 ]
[ 1   3 ]

B =
[ 1   2 ]
[ 3   1 ]

Se verifican:

* det(AB) = det(A) × det(B)
* det(Aᵀ) = det(A)

### **Cálculos**

1. det(A) = (2·3) − (1·1) = 5
2. det(B) = (1·1) − (2·3) = -5
3. Producto AB =

```
[  5   5 ]
[ 10   5 ]
```

4. det(AB) = (5·5) − (5·10) = -25

### **Verificación**

* det(A)·det(B) = 5 × (-5) = -25 ✓
* Aᵀ = A → det(Aᵀ) = 5 = det(A) ✓

---

# 🔢 **Ejercicio 5: Aplicación Geométrica (Vectores en R²)**

Datos:
u = (3, 2)
v = (1, 4)

Se forma la matriz cuyas columnas son los vectores:
M =
[ 3   1 ]
[ 2   4 ]

### **a) Área del paralelogramo**

```
det(M) = (3·4) − (1·2) = 12 − 2 = **10**
```

\Área = |10| = **10 unidades²**

### **b) ¿Cambia el área si se intercambian los vectores?**

M' =
[ 1   3 ]
[ 4   2 ]
det(M') = (1·2) − (3·4) = 2 − 12 = -10

\Área = |−10| = **10** (no cambia)

### **c) Signo del determinante**

* Positivo → orientación antihoraria
* Negativo → orientación horaria

El signo afecta la orientación, **no el área**.

---

## 🧩 **Conclusión General**

En todos los ejercicios se aplicó correctamente la fórmula del determinante 2×2. Se identificó claramente:

* Qué matrices son singulares (det = 0)
* Cuándo el determinante es positivo o negativo
* La importancia de las diagonales en el cálculo

Este procedimiento es fundamental para temas posteriores como **inversas**, **áreas**, **regla de Cramer** y **propiedades de transformaciones lineales**.

