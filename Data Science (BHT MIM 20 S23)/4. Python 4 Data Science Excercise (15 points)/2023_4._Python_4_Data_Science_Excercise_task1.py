import numpy as np

#given: score = np.array([103, 1502, 6230, 3, 1682, 5241, 4532])
sorted_indices_list = np.argsort(np.array([103, 1502, 6230, 3, 1682, 5241, 4532]))

print("sorted_indices_list:", sorted_indices_list)
