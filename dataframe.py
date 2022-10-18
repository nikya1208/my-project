import pandas as pd
import numpy as np
from pandas import DataFrame

array = np.arange(15).reshape(5,3)
df = DataFrame(array)
print(df.index)
print(df.columns)
df