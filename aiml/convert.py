import pandas as pd

df = pd.read_csv("./data.csv", engine='python')
with open("test.md", "w") as md:
    df.to_markdown(buf=md, tablefmt="grid")

#pip