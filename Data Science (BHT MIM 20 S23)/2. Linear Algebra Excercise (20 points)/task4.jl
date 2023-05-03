using LinearAlgebra

A   =   [4 -2 1; 5 0 3; -1 2 6]

println()
println("Die Inverse Matrix ist: ", inv(A))
println()
println("Die Determinante der Matrix A ist: ", det(A))
println()
println("Die eigenvalues der Matrix A ist: ", eigvals(A))
println()