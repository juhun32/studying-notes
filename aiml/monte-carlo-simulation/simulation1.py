import numpy as np
from multiprocessing import Pool
from matplotlib import pyplot as plt

if __name__ == '__main__':
    N = 10000
    x = np.random.random([N, 2])
    distance = np.sum(x ** 2.0, axis=1)
    in_out = distance <= 1.0
    pi = np.sum(in_out)*4/N # Pi 값은 천제 시행에서 원 안에 있는 점의 갯수로 정해짐
    color = list(map(lambda x: 'red' if x else 'blue', in_out))

    plt.figure(figsize=(7, 7))
    plt.scatter(x[:,0], x[:,1], color = color, s=5, label ='Result : {}'.format(np.round(pi, 4)))
    
    cx = np.cos(np.linspace(0, np.pi/2, 1000))
    cy = np.sin(np.linspace(0, np.pi/2, 1000))
    plt.plot(cx, cy, color = 'black', lw =2) # 원의 경계
    plt.legend(loc = 'lower right')

    plt.xlim(0, 1)
    plt.ylim(0, 1)
    plt.show()