using LinearAlgebra

#   x + y + z = 6
#   2y + 5z = -4
#   2x + 5y - z = 27 

A   =   [1 1 1; 0 2 5; 2 5 -1]
A1  =   [6 1 1; -4 2 5; 27 5 -1]
A2  =   [1 6 1; 0 -4 5; 2 27 -1]
A3  =   [1 1 6; 0 2 -4; 2 5 27]

x   =   det(A1)/det(A)
y   =   det(A2)/det(A)
z   =   det(A3)/det(A)

println()
println(round(x, digits=2), "+", round(y, digits=2), "+", round(z, digits=2), "=", 6)
println()
println("x = ", round(x, digits=2))
println("y = ", y)
println("z = ", z)
println()