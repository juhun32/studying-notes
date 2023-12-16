import random
import pandas as pd
import matplotlib.pyplot as plt

def sim(stock):
    gain = 0
    loss = 300*stock
    for p in range(int(random.gauss(557, 183))):
        if stock > 0:
            if random.random() < 0.05:
                stock -= 1
                gain += 1000
        else:
            if random.random() < 0.025:
                gain += 1000

    return gain-loss

def iter_sim(max_stock, how_many):
    final = []
    for _ in range(how_many):
        result = []
        for stock in range(1, max_stock):
            result.append(sim(stock))

        final.append(result)

    # 시각화
    plt.style.use('seaborn-whitegrid')
    output = pd.DataFrame(final)
    ax = output.T.plot(lw=0.1, color='black', legend=False)
    ax.set_xlabel("Stock")
    ax.set_ylabel("Gain / Loss")

    output.mean().plot(lw=5, color='red', legend=False)
    plt.show()


if __name__ == '__main__':
    iter_sim(150, 100)