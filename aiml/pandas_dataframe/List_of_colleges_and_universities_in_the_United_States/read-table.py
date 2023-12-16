import os
import pandas as pd

url = "https://en.wikipedia.org/wiki/List_of_colleges_and_universities_in_the_United_States_by_endowment"

tables = pd.read_html(url, header = 0)
print(f"Total tables: {len(tables)}")

df1 = tables[0]
newpath = './web-crawl/List_of_colleges_and_universities_in_the_United_States/List_of_colleges_and_universities_in_the_United_States_by_endowment/private-schools' 
if not os.path.exists(newpath):
    os.makedirs(newpath)
df1.to_csv("./web-crawl/List_of_colleges_and_universities_in_the_United_States/List_of_colleges_and_universities_in_the_United_States_by_endowment/private-schools/colleges_universities_list_by_endowment_1.csv")
df1.to_markdown("./web-crawl/List_of_colleges_and_universities_in_the_United_States/List_of_colleges_and_universities_in_the_United_States_by_endowment/private-schools/colleges_universities_list_by_endowment_1.md")


df2 = tables[1]
newpath = './web-crawl/List_of_colleges_and_universities_in_the_United_States/List_of_colleges_and_universities_in_the_United_States_by_endowment/public-schools' 
if not os.path.exists(newpath):
    os.makedirs(newpath)
df2.to_csv("./web-crawl/List_of_colleges_and_universities_in_the_United_States/List_of_colleges_and_universities_in_the_United_States_by_endowment/public-schools/colleges_universities_list_by_endowment_2.csv")
df2.to_markdown("./web-crawl/List_of_colleges_and_universities_in_the_United_States/List_of_colleges_and_universities_in_the_United_States_by_endowment/public-schools/colleges_universities_list_by_endowment_2.md")

# -------------------------------------------------------------------------------------------------------------------

url = "https://en.wikipedia.org/wiki/List_of_colleges_and_universities_in_Virginia"

tables = pd.read_html(url)
print(f"Total tables: {len(tables)}")

df = tables[0]
newpath = './web-crawl/List_of_colleges_and_universities_in_the_United_States/List_of_colleges_and_universities_in_Virginia' 
if not os.path.exists(newpath):
    os.makedirs(newpath)
df.to_csv("./web-crawl/List_of_colleges_and_universities_in_the_United_States/List_of_colleges_and_universities_in_Virginia/List_of_colleges_and_universities_in_Virginia.csv")
df.to_markdown("./web-crawl/List_of_colleges_and_universities_in_the_United_States/List_of_colleges_and_universities_in_Virginia/List_of_colleges_and_universities_in_Virginia.md")
