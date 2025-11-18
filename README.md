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

### Ejercicio 1.1 — Matriz **A**

#### Enunciado


Calcular \(\det(\mathbf{A})\).

#### Solución


\[
\det(\mathbf{A}) = (5)(1) - (2)(3) = 5 - 6 = -1
\]



#### Procedimiento
1. Multiplicar diagonal principal:
2.
3.   \(5 \cdot 1 = 5\).  
4. Multiplicar diagonal secundaria:
5.
6.
7.    \(2 \cdot 3 = 6\).


8. Restar: \(5 - 6 = -1\).

---

### Ejercicio 1.2 — Matriz **B**

#### Enunciado
Calcular 


\(\det(\mathbf{B})\).



#### Solución




\[
\det(\mathbf{B}) = (-1)(-8) - (4)(2) = 8 - 8 = 0
\]




#### Procedimiento
1. DP: \((-1)(-8)=8\)  
2. DS: \(4\cdot 2 = 8\)  
3. Restar: \(8-8=0\). (Matriz singular)

---

### Ejercicio 1.3 — Matriz **C**

#### Enunciado
Calcular \(\det(\mathbf{C})\).

#### Solución
\[
\det(\mathbf{C}) = (6)(3) - (9)(2) = 18 - 18 = 0
\]

#### Procedimiento
1. DP: \(6\cdot 3 = 18\)  
2. DS: \(9\cdot 2 = 18\)  
3. Restar: \(18-18=0\). (Matriz singular)

---

### Ejercicio 1.4 — Matriz **D**

#### Enunciado
Calcular \(\det(\mathbf{D})\).

#### Solución
\[
\det(\mathbf{D}) = (0)(0) - (5)(-5) = 0 - (-25) = 25
\]

#### Procedimiento
1. DP: \(0\cdot 0 = 0\)  
2. DS: \(5\cdot(-5) = -25\)  
3. Restar: \(0 - (-25) = 25\).

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

> **Nota:** Aquí se muestra el procedimiento de Sarrus (diagonales positivas y negativas) y el resultado final.

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
\[
\det(\mathbf{E}) = 40 - 39 = 1
\]

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
\[
\det(\mathbf{F}) = (-10) - 38 = -48
\]

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
