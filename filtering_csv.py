import pandas as pd

# CSV laden, wobei die zweite Zeile als Header genutzt wird
df = pd.read_csv("stats.csv", header=1)

# Liste der gewünschten Spalten
columns_to_keep = ["Player", "Nation", "Pos", "Age", "MP", "Starts", "Min", "Gls", "Ast", "PK", "CrdY", "CrdR", "xG", "xAG", "Team"]

# Nur die gewünschten Spalten auswählen
df = df[columns_to_keep]

#initialise empty cells
df = df.where(pd.notnull(df), 'nan')


# Bereinigung der 'Age'-Spalte (Text nach '-' entfernen)
df['Age'] = df['Age'].str.split('-').str[0]

df['MP'] = df['MP'].astype(str)  # Zuerst in Strings umwandeln
df['MP'] = df['MP'].str.split('.').str[0]  # Dann den Punkt entfernen

df['Age'] = df['Age'].astype(str)  # Zuerst in Strings umwandeln
df['Age'] = df['Age'].str.split('.').str[0]  # Dann den Punkt

# Änderungen in eine neue Datei speichern
df.to_csv("filtered_stats.csv", index=False)
