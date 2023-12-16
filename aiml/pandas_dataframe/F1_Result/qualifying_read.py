import os
import pandas as pd

newpath = "./web-crawl/F1_Result/2023/Azerbaijan"
if not os.path.exists(newpath):
    os.makedirs(newpath)


url = "https://www.formula1.com/en/results.html/2023/races/1207/azerbaijan/qualifying.html"

tables = pd.read_html(url, header=0)
print(f"Total tables: {len(tables)}")

df_quali = tables[0]
# df_res = df_quali.drop(['Unnamed: 0','Unnamed: 9'], axis = 1)
df_res = df_quali.drop(df_quali.columns[[0,9]], axis = 1)
df_res.to_csv("./web-crawl/F1_Result/2023/Azerbaijan/Qualifying.csv")
df_res.to_markdown("./web-crawl/F1_Result/2023/Azerbaijan/Qualifying.md")

