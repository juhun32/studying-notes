import numpy as np
import matplotlib.pyplot as plt

# 시드 부여
np.random.seed(2022)

# 임의의 모수 값 지정
N = 500
beta_0 = 10
beta_1 = 0.5

# 샘플 데이터 형성
x = np.arange(start = 0, stop = N + 1, step = 1)
resid = np.random.normal(loc = 0, scale = 7, size = len(x))
y_hat = beta_0 + beta_1 * x + resid
y = beta_0 + beta_1 * x

# 시각화
plt.figure(figsize = (10, 8))
plt.plot(x, y_hat, linestyle = "None", marker = "o", markerfacecolor = 'none')
plt.plot(x, y, linestyle = "dashed")
plt.show()

