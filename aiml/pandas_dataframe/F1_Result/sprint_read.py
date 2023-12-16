import os
import pandas as pd

newpath = "./web-crawl/F1_Result/2023/Azerbaijan"
if not os.path.exists(newpath):
    os.makedirs(newpath)


url = "https://www.formula1.com/en/results.html/2023/races/1207/azerbaijan/sprint-results.html"

tables = pd.read_html(url, header=0)
print(f"Total tables: {len(tables)}")

df_sprint = tables[0]
df_res = df_sprint.drop(df_sprint.columns[[0,8]], axis = 1)
df_res.to_csv("./web-crawl/F1_Result/2023/Azerbaijan/Sprint.csv")
df_res.to_markdown("./web-crawl/F1_Result/2023/Azerbaijan/Sprint.md")