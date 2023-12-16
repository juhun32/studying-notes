from tqdm import tqdm
import pandas as pd
import numpy as np
from matplotlib import pyplot as plt

# 변수 설정
n = 500000
count = 0
x_list_under = []
y_list_under = []
x_list_upper = []
y_list_upper = []

for i in tqdm(range(n)):
    # 시드 부여 (난수)
    np.random.seed(i)
    # 0,1 사이의 난수 값 생성
    x = np.random.random()
    y = np.random.random()
    # 원 내부에 있는 점을 만족하는 경우, 그렇지 않은 경우 분리
    if (x**2 + y**2) <= 1: 
        count += 1
        x_list_under.append(x)
        y_list_under.append(y)
    else:
        x_list_upper.append(x)
        y_list_upper.append(y)
    
# 원 내부일 확률은 원 넓이의 1/4 이므로 곱하기 4로 π 계산
print('\u03C0 값', 4*count/n)

under = pd.DataFrame(zip(x_list_under,y_list_under), columns=['x_under', 'y_under'])
upper = pd.DataFrame(zip(x_list_upper,y_list_upper), columns=['x_upper', 'y_upper'])

plt.figure(figsize=(8,8))
plt.scatter(under['x_under'], under['y_under'], s=1)
plt.scatter(upper['x_upper'], upper['y_upper'], s=1)
plt.xlabel('x')
plt.ylabel('y')
plt.show()