name = list(input("Input the name of variable: "))
result = True

def ascii(n):
    ord_n = ord(n)
    if ord_n < 48 or 57 < ord_n < 65 or 91 < ord_n < 95 or ord_n == 96 or 123 <= ord_n:
        return False
    return True

fir_ch = ord(name[0])

if fir_ch == 95 or 96 < fir_ch < 123 or 64 < fir_ch < 91:
    for n in name:
        if ascii(n):
            continue
        else:
            result = False
else:
    result = False

print(result)