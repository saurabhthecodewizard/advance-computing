1. Write a query to get Product name and quantity/unit.

D3_56588>SELECT ProductName, QuantityPerUnit FROM products;
+----------------------------------+----------------------+
| ProductName                      | QuantityPerUnit      |
+----------------------------------+----------------------+
| Chai                             | 10 boxes x 20 bags   |
| Chang                            | 24 - 12 oz bottles   |
| Aniseed Syrup                    | 12 - 550 ml bottles  |
| Chef Anton's Cajun Seasoning     | 48 - 6 oz jars       |
| Chef Anton's Gumbo Mix           | 36 boxes             |
| Grandma's Boysenberry Spread     | 12 - 8 oz jars       |
| Uncle Bob's Organic Dried Pears  | 12 - 1 lb pkgs.      |
| Northwoods Cranberry Sauce       | 12 - 12 oz jars      |
| Mishi Kobe Niku                  | 18 - 500 g pkgs.     |
| Ikura                            | 12 - 200 ml jars     |
| Queso Cabrales                   | 1 kg pkg.            |
| Queso Manchego La Pastora        | 10 - 500 g pkgs.     |
| Konbu                            | 2 kg box             |
| Tofu                             | 40 - 100 g pkgs.     |
| Genen Shouyu                     | 24 - 250 ml bottles  |
| Pavlova                          | 32 - 500 g boxes     |
| Alice Mutton                     | 20 - 1 kg tins       |
| Carnarvon Tigers                 | 16 kg pkg.           |
| Teatime Chocolate Biscuits       | 10 boxes x 12 pieces |
| Sir Rodney's Marmalade           | 30 gift boxes        |
| Sir Rodney's Scones              | 24 pkgs. x 4 pieces  |
| Gustaf's Knckebrd                | 24 - 500 g pkgs.     |
| Tunnbrd                          | 12 - 250 g pkgs.     |
| Guaran Fantstica                 | 12 - 355 ml cans     |
| NuNuCa Nu-Nougat-Creme           | 20 - 450 g glasses   |
| Gumbr Gummibrchen                | 100 - 250 g bags     |
| Schoggi Schokolade               | 100 - 100 g pieces   |
| Rssle Sauerkraut                 | 25 - 825 g cans      |
| Thringer Rostbratwurst           | 50 bags x 30 sausgs. |
| Nord-Ost Matjeshering            | 10 - 200 g glasses   |
| Gorgonzola Telino                | 12 - 100 g pkgs      |
| Mascarpone Fabioli               | 24 - 200 g pkgs.     |
| Geitost                          | 500 g                |
| Sasquatch Ale                    | 24 - 12 oz bottles   |
| Steeleye Stout                   | 24 - 12 oz bottles   |
| Inlagd Sill                      | 24 - 250 g  jars     |
| Gravad lax                       | 12 - 500 g pkgs.     |
| Cte de Blaye                     | 12 - 75 cl bottles   |
| Chartreuse verte                 | 750 cc per bottle    |
| Boston Crab Meat                 | 24 - 4 oz tins       |
| Jack's New England Clam Chowder  | 12 - 12 oz cans      |
| Singaporean Hokkien Fried Mee    | 32 - 1 kg pkgs.      |
| Ipoh Coffee                      | 16 - 500 g tins      |
| Gula Malacca                     | 20 - 2 kg bags       |
| Rogede sild                      | 1k pkg.              |
| Spegesild                        | 4 - 450 g glasses    |
| Zaanse koeken                    | 10 - 4 oz boxes      |
| Chocolade                        | 10 pkgs.             |
| Maxilaku                         | 24 - 50 g pkgs.      |
| Valkoinen suklaa                 | 12 - 100 g bars      |
| Manjimup Dried Apples            | 50 - 300 g pkgs.     |
| Filo Mix                         | 16 - 2 kg boxes      |
| Perth Pasties                    | 48 pieces            |
| Tourtire                         | 16 pies              |
| Pt chinois                       | 24 boxes x 2 pies    |
| Gnocchi di nonna Alice           | 24 - 250 g pkgs.     |
| Ravioli Angelo                   | 24 - 250 g pkgs.     |
| Escargots de Bourgogne           | 24 pieces            |
| Raclette Courdavault             | 5 kg pkg.            |
| Camembert Pierrot                | 15 - 300 g rounds    |
| Sirop d'rable                    | 24 - 500 ml bottles  |
| Tarte au sucre                   | 48 pies              |
| Vegie-spread                     | 15 - 625 g jars      |
| Wimmers gute Semmelkndel         | 20 bags x 4 pieces   |
| Louisiana Fiery Hot Pepper Sauce | 32 - 8 oz bottles    |
| Louisiana Hot Spiced Okra        | 24 - 8 oz jars       |
| Laughing Lumberjack Lager        | 24 - 12 oz bottles   |
| Scottish Longbreads              | 10 boxes x 8 pieces  |
| Gudbrandsdalsost                 | 10 kg pkg.           |
| Outback Lager                    | 24 - 355 ml bottles  |
| Flotemysost                      | 10 - 500 g pkgs.     |
| Mozzarella di Giovanni           | 24 - 200 g pkgs.     |
| Rd Kaviar                        | 24 - 150 g jars      |
| Longlife Tofu                    | 5 kg pkg.            |
| Rhnbru Klosterbier               | 24 - 0.5 l bottles   |
| Lakkalikri                       | 500 ml               |
| Original Frankfurter grne Soe    | 12 boxes             |
+----------------------------------+----------------------+
77 rows in set (0.00 sec)










2. Write a query to get current Product list (Product ID and name).

D3_56588>SELECT ProductID, ProductName FROM products;
+-----------+----------------------------------+
| ProductID | ProductName                      |
+-----------+----------------------------------+
|        17 | Alice Mutton                     |
|         3 | Aniseed Syrup                    |
|        40 | Boston Crab Meat                 |
|        60 | Camembert Pierrot                |
|        18 | Carnarvon Tigers                 |
|         1 | Chai                             |
|         2 | Chang                            |
|        39 | Chartreuse verte                 |
|         4 | Chef Anton's Cajun Seasoning     |
|         5 | Chef Anton's Gumbo Mix           |
|        48 | Chocolade                        |
|        38 | Cte de Blaye                     |
|        58 | Escargots de Bourgogne           |
|        52 | Filo Mix                         |
|        71 | Flotemysost                      |
|        33 | Geitost                          |
|        15 | Genen Shouyu                     |
|        56 | Gnocchi di nonna Alice           |
|        31 | Gorgonzola Telino                |
|         6 | Grandma's Boysenberry Spread     |
|        37 | Gravad lax                       |
|        24 | Guaran Fantstica                 |
|        69 | Gudbrandsdalsost                 |
|        44 | Gula Malacca                     |
|        26 | Gumbr Gummibrchen                |
|        22 | Gustaf's Knckebrd                |
|        10 | Ikura                            |
|        36 | Inlagd Sill                      |
|        43 | Ipoh Coffee                      |
|        41 | Jack's New England Clam Chowder  |
|        13 | Konbu                            |
|        76 | Lakkalikri                       |
|        67 | Laughing Lumberjack Lager        |
|        74 | Longlife Tofu                    |
|        65 | Louisiana Fiery Hot Pepper Sauce |
|        66 | Louisiana Hot Spiced Okra        |
|        51 | Manjimup Dried Apples            |
|        32 | Mascarpone Fabioli               |
|        49 | Maxilaku                         |
|         9 | Mishi Kobe Niku                  |
|        72 | Mozzarella di Giovanni           |
|        30 | Nord-Ost Matjeshering            |
|         8 | Northwoods Cranberry Sauce       |
|        25 | NuNuCa Nu-Nougat-Creme           |
|        77 | Original Frankfurter grne Soe    |
|        70 | Outback Lager                    |
|        16 | Pavlova                          |
|        53 | Perth Pasties                    |
|        55 | Pt chinois                       |
|        11 | Queso Cabrales                   |
|        12 | Queso Manchego La Pastora        |
|        59 | Raclette Courdavault             |
|        57 | Ravioli Angelo                   |
|        73 | Rd Kaviar                        |
|        75 | Rhnbru Klosterbier               |
|        45 | Rogede sild                      |
|        28 | Rssle Sauerkraut                 |
|        34 | Sasquatch Ale                    |
|        27 | Schoggi Schokolade               |
|        68 | Scottish Longbreads              |
|        42 | Singaporean Hokkien Fried Mee    |
|        20 | Sir Rodney's Marmalade           |
|        21 | Sir Rodney's Scones              |
|        61 | Sirop d'rable                    |
|        46 | Spegesild                        |
|        35 | Steeleye Stout                   |
|        62 | Tarte au sucre                   |
|        19 | Teatime Chocolate Biscuits       |
|        29 | Thringer Rostbratwurst           |
|        14 | Tofu                             |
|        54 | Tourtire                         |
|        23 | Tunnbrd                          |
|         7 | Uncle Bob's Organic Dried Pears  |
|        50 | Valkoinen suklaa                 |
|        63 | Vegie-spread                     |
|        64 | Wimmers gute Semmelkndel         |
|        47 | Zaanse koeken                    |
+-----------+----------------------------------+
77 rows in set (0.00 sec)











3. Write a query to get Product list (id, name, unit price) where current products cost less than $20.

D3_56588>SELECT ProductID, ProductName, UnitPrice FROM products WHERE UnitPrice<20;
+-----------+---------------------------------+-----------+
| ProductID | ProductName                     | UnitPrice |
+-----------+---------------------------------+-----------+
|         1 | Chai                            |   18.0000 |
|         2 | Chang                           |   19.0000 |
|         3 | Aniseed Syrup                   |   10.0000 |
|        13 | Konbu                           |    6.0000 |
|        15 | Genen Shouyu                    |   15.5000 |
|        16 | Pavlova                         |   17.4500 |
|        19 | Teatime Chocolate Biscuits      |    9.2000 |
|        21 | Sir Rodney's Scones             |   10.0000 |
|        23 | Tunnbrd                         |    9.0000 |
|        24 | Guaran Fantstica                |    4.5000 |
|        25 | NuNuCa Nu-Nougat-Creme          |   14.0000 |
|        31 | Gorgonzola Telino               |   12.5000 |
|        33 | Geitost                         |    2.5000 |
|        34 | Sasquatch Ale                   |   14.0000 |
|        35 | Steeleye Stout                  |   18.0000 |
|        36 | Inlagd Sill                     |   19.0000 |
|        39 | Chartreuse verte                |   18.0000 |
|        40 | Boston Crab Meat                |   18.4000 |
|        41 | Jack's New England Clam Chowder |    9.6500 |
|        42 | Singaporean Hokkien Fried Mee   |   14.0000 |
|        44 | Gula Malacca                    |   19.4500 |
|        45 | Rogede sild                     |    9.5000 |
|        46 | Spegesild                       |   12.0000 |
|        47 | Zaanse koeken                   |    9.5000 |
|        48 | Chocolade                       |   12.7500 |
|        50 | Valkoinen suklaa                |   16.2500 |
|        52 | Filo Mix                        |    7.0000 |
|        54 | Tourtire                        |    7.4500 |
|        57 | Ravioli Angelo                  |   19.5000 |
|        58 | Escargots de Bourgogne          |   13.2500 |
|        66 | Louisiana Hot Spiced Okra       |   17.0000 |
|        67 | Laughing Lumberjack Lager       |   14.0000 |
|        68 | Scottish Longbreads             |   12.5000 |
|        70 | Outback Lager                   |   15.0000 |
|        73 | Rd Kaviar                       |   15.0000 |
|        74 | Longlife Tofu                   |   10.0000 |
|        75 | Rhnbru Klosterbier              |    7.7500 |
|        76 | Lakkalikri                      |   18.0000 |
|        77 | Original Frankfurter grne Soe   |   13.0000 |
+-----------+---------------------------------+-----------+
39 rows in set (0.00 sec)









4. Write a query to get Product list (id, name, unit price) where products cost between $15 and $25.

D3_56588>SELECT  ProductID, ProductName, UnitPrice FROM PRODUCTS WHERE UnitPrice BETWEEN 15 AND 25;
+-----------+----------------------------------+-----------+
| ProductID | ProductName                      | UnitPrice |
+-----------+----------------------------------+-----------+
|         1 | Chai                             |   18.0000 |
|         2 | Chang                            |   19.0000 |
|         4 | Chef Anton's Cajun Seasoning     |   22.0000 |
|         5 | Chef Anton's Gumbo Mix           |   21.3500 |
|         6 | Grandma's Boysenberry Spread     |   25.0000 |
|        11 | Queso Cabrales                   |   21.0000 |
|        14 | Tofu                             |   23.2500 |
|        15 | Genen Shouyu                     |   15.5000 |
|        16 | Pavlova                          |   17.4500 |
|        22 | Gustaf's Knckebrd                |   21.0000 |
|        35 | Steeleye Stout                   |   18.0000 |
|        36 | Inlagd Sill                      |   19.0000 |
|        39 | Chartreuse verte                 |   18.0000 |
|        40 | Boston Crab Meat                 |   18.4000 |
|        44 | Gula Malacca                     |   19.4500 |
|        49 | Maxilaku                         |   20.0000 |
|        50 | Valkoinen suklaa                 |   16.2500 |
|        55 | Pt chinois                       |   24.0000 |
|        57 | Ravioli Angelo                   |   19.5000 |
|        65 | Louisiana Fiery Hot Pepper Sauce |   21.0500 |
|        66 | Louisiana Hot Spiced Okra        |   17.0000 |
|        70 | Outback Lager                    |   15.0000 |
|        71 | Flotemysost                      |   21.5000 |
|        73 | Rd Kaviar                        |   15.0000 |
|        76 | Lakkalikri                       |   18.0000 |
+-----------+----------------------------------+-----------+
25 rows in set (0.00 sec)











5. Write a query to get CategoryName and Description from the Categories table.

D3_56588>SELECT  CategoryName, Description FROM categories;
+----------------+------------------------------------------------------------+
| CategoryName   | Description                                                |
+----------------+------------------------------------------------------------+
| Beverages      | Soft drinks, coffees, teas, beers, and ales                |
| Condiments     | Sweet and savory sauces, relishes, spreads, and seasonings |
| Confections    | Desserts, candies, and sweet breads                        |
| Dairy Products | Cheeses                                                    |
| Grains/Cereals | Breads, crackers, pasta, and cereal                        |
| Meat/Poultry   | Prepared meats                                             |
| Produce        | Dried fruit and bean curd                                  |
| Seafood        | Seaweed and fish                                           |
+----------------+------------------------------------------------------------+
8 rows in set (0.00 sec)











6. Write a query to get ContactName, CompanyName, ContactTitle and Phone from the Customers table.

D3_56588>SELECT ContactName, CompanyName, ContactTitle, Phone FROM customers;
+-------------------------+--------------------------------------+--------------------------------+-------------------+
| ContactName             | CompanyName                          | ContactTitle                   | Phone             |
+-------------------------+--------------------------------------+--------------------------------+-------------------+
| Maria Anders            | Alfreds Futterkiste                  | Sales Representative           | 030-0074321       |
| Ana Trujillo            | Ana Trujillo Emparedados y helados   | Owner                          | (5) 555-4729      |
| Antonio Moreno          | Antonio Moreno Taquera               | Owner                          | (5) 555-3932      |
| Thomas Hardy            | Around the Horn                      | Sales Representative           | (171) 555-7788    |
| Christina Berglund      | Berglunds snabbkp                    | Order Administrator            | 0921-12 34 65     |
| Hanna Moos              | Blauer See Delikatessen              | Sales Representative           | 0621-08460        |
| Frdrique Citeaux        | Blondesddsl pre et fils              | Marketing Manager              | 88.60.15.31       |
| Martn Sommer            | Blido Comidas preparadas             | Owner                          | (91) 555 22 82    |
| Laurence Lebihan        | Bon app'                             | Owner                          | 91.24.45.40       |
| Elizabeth Lincoln       | Bottom-Dollar Markets                | Accounting Manager             | (604) 555-4729    |
| Victoria Ashworth       | B's Beverages                        | Sales Representative           | (171) 555-1212    |
| Patricio Simpson        | Cactus Comidas para llevar           | Sales Agent                    | (1) 135-5555      |
| Francisco Chang         | Centro comercial Moctezuma           | Marketing Manager              | (5) 555-3392      |
| Yang Wang               | Chop-suey Chinese                    | Owner                          | 0452-076545       |
| Pedro Afonso            | Comrcio Mineiro                      | Sales Associate                | (11) 555-7647     |
| Elizabeth Brown         | Consolidated Holdings                | Sales Representative           | (171) 555-2282    |
| Sven Ottlieb            | Drachenblut Delikatessen             | Order Administrator            | 0241-039123       |
| Janine Labrune          | Du monde entier                      | Owner                          | 40.67.88.88       |
| Ann Devon               | Eastern Connection                   | Sales Agent                    | (171) 555-0297    |
| Roland Mendel           | Ernst Handel                         | Sales Manager                  | 7675-3425         |
| Aria Cruz               | Familia Arquibaldo                   | Marketing Assistant            | (11) 555-9857     |
| Diego Roel              | FISSA Fabrica Inter. Salchichas S.A. | Accounting Manager             | (91) 555 94 44    |
| Martine Ranc            | Folies gourmandes                    | Assistant Sales Agent          | 20.16.10.16       |
| Maria Larsson           | Folk och f HB                        | Owner                          | 0695-34 67 21     |
| Peter Franken           | Frankenversand                       | Marketing Manager              | 089-0877310       |
| Carine Schmitt          | France restauration                  | Marketing Manager              | 40.32.21.21       |
| Paolo Accorti           | Franchi S.p.A.                       | Sales Representative           | 011-4988260       |
| Lino Rodriguez          | Furia Bacalhau e Frutos do Mar       | Sales Manager                  | (1) 354-2534      |
| Eduardo Saavedra        | Galera del gastrnomo                 | Marketing Manager              | (93) 203 4560     |
| Jos Pedro Freyre        | Godos Cocina Tpica                   | Sales Manager                  | (95) 555 82 82    |
| Andr Fonseca            | Gourmet Lanchonetes                  | Sales Associate                | (11) 555-9482     |
| Howard Snyder           | Great Lakes Food Market              | Marketing Manager              | (503) 555-7555    |
| Manuel Pereira          | GROSELLA-Restaurante                 | Owner                          | (2) 283-2951      |
| Mario Pontes            | Hanari Carnes                        | Accounting Manager             | (21) 555-0091     |
| Carlos Hernndez         | HILARION-Abastos                     | Sales Representative           | (5) 555-1340      |
| Yoshi Latimer           | Hungry Coyote Import Store           | Sales Representative           | (503) 555-6874    |
| Patricia McKenna        | Hungry Owl All-Night Grocers         | Sales Associate                | 2967 542          |
| Helen Bennett           | Island Trading                       | Marketing Manager              | (198) 555-8888    |
| Philip Cramer           | Kniglich Essen                       | Sales Associate                | 0555-09876        |
| Daniel Tonini           | La corne d'abondance                 | Sales Representative           | 30.59.84.10       |
| Annette Roulet          | La maison d'Asie                     | Sales Manager                  | 61.77.61.10       |
| Yoshi Tannamuri         | Laughing Bacchus Wine Cellars        | Marketing Assistant            | (604) 555-3392    |
| John Steel              | Lazy K Kountry Store                 | Marketing Manager              | (509) 555-7969    |
| Renate Messner          | Lehmanns Marktstand                  | Sales Representative           | 069-0245984       |
| Jaime Yorres            | Let's Stop N Shop                    | Owner                          | (415) 555-5938    |
| Carlos Gonzlez          | LILA-Supermercado                    | Accounting Manager             | (9) 331-6954      |
| Felipe Izquierdo        | LINO-Delicateses                     | Owner                          | (8) 34-56-12      |
| Fran Wilson             | Lonesome Pine Restaurant             | Sales Manager                  | (503) 555-9573    |
| Giovanni Rovelli        | Magazzini Alimentari Riuniti         | Marketing Manager              | 035-640230        |
| Catherine Dewey         | Maison Dewey                         | Sales Agent                    | (02) 201 24 67    |
| Jean Fresnire           | Mre Paillarde                        | Marketing Assistant            | (514) 555-8054    |
| Alexander Feuer         | Morgenstern Gesundkost               | Marketing Assistant            | 0342-023176       |
| Simon Crowther          | North/South                          | Sales Associate                | (171) 555-7733    |
| Yvonne Moncada          | Ocano Atlntico Ltda.                 | Sales Agent                    | (1) 135-5333      |
| Rene Phillips           | Old World Delicatessen               | Sales Representative           | (907) 555-7584    |
| Henriette Pfalzheim     | Ottilies Kseladen                    | Owner                          | 0221-0644327      |
| Marie Bertrand          | Paris spcialits                      | Owner                          | (1) 42.34.22.66   |
| Guillermo Fernndez      | Pericles Comidas clsicas             | Sales Representative           | (5) 552-3745      |
| Georg Pipps             | Piccolo und mehr                     | Sales Manager                  | 6562-9722         |
| Isabel de Castro        | Princesa Isabel Vinhos               | Sales Representative           | (1) 356-5634      |
| Bernardo Batista        | Que Delcia                           | Accounting Manager             | (21) 555-4252     |
| Lcia Carvalho           | Queen Cozinha                        | Marketing Assistant            | (11) 555-1189     |
| Horst Kloss             | QUICK-Stop                           | Accounting Manager             | 0372-035188       |
| Sergio Gutirrez         | Rancho grande                        | Sales Representative           | (1) 123-5555      |
| Paula Wilson            | Rattlesnake Canyon Grocery           | Assistant Sales Representative | (505) 555-5939    |
| Maurizio Moroni         | Reggiani Caseifici                   | Sales Associate                | 0522-556721       |
| Janete Limeira          | Ricardo Adocicados                   | Assistant Sales Agent          | (21) 555-3412     |
| Michael Holz            | Richter Supermarkt                   | Sales Manager                  | 0897-034214       |
| Alejandra Camino        | Romero y tomillo                     | Accounting Manager             | (91) 745 6200     |
| Jonas Bergulfsen        | Sant Gourmet                         | Owner                          | 07-98 92 35       |
| Jose Pavarotti          | Save-a-lot Markets                   | Sales Representative           | (208) 555-8097    |
| Hari Kumar              | Seven Seas Imports                   | Sales Manager                  | (171) 555-1717    |
| Jytte Petersen          | Simons bistro                        | Owner                          | 31 12 34 56       |
| Dominique Perrier       | Spcialits du monde                   | Marketing Manager              | (1) 47.55.60.10   |
| Art Braunschweiger      | Split Rail Beer & Ale                | Sales Manager                  | (307) 555-4680    |
| Pascale Cartrain        | Suprmes dlices                       | Accounting Manager             | (071) 23 67 22 20 |
| Liz Nixon               | The Big Cheese                       | Marketing Manager              | (503) 555-3612    |
| Liu Wong                | The Cracker Box                      | Marketing Assistant            | (406) 555-5834    |
| Karin Josephs           | Toms Spezialitten                    | Marketing Manager              | 0251-031259       |
| Miguel Angel Paolino    | Tortuga Restaurante                  | Owner                          | (5) 555-2933      |
| Anabela Domingues       | Tradio Hipermercados                 | Sales Representative           | (11) 555-2167     |
| Helvetius Nagy          | Trail's Head Gourmet Provisioners    | Sales Associate                | (206) 555-8257    |
| Palle Ibsen             | Vaffeljernet                         | Sales Manager                  | 86 21 32 43       |
| Val2                    | IT                                   | IT                             | NULL              |
| Valon Hoti              | IT                                   | IT                             | NULL              |
| Mary Saveley            | Victuailles en stock                 | Sales Agent                    | 78.32.54.86       |
| Paul Henriot            | Vins et alcools Chevalier            | Accounting Manager             | 26.47.15.10       |
| Rita Mller              | Die Wandernde Kuh                    | Sales Representative           | 0711-020361       |
| Pirkko Koskitalo        | Wartian Herkku                       | Accounting Manager             | 981-443655        |
| Paula Parente           | Wellington Importadora               | Sales Manager                  | (14) 555-8122     |
| Karl Jablonski          | White Clover Markets                 | Owner                          | (206) 555-4112    |
| Matti Karttunen         | Wilman Kala                          | Owner/Marketing Assistant      | 90-224 8858       |
| Zbyszek Piestrzeniewicz | Wolski  Zajazd                       | Owner                          | (26) 642-7012     |
+-------------------------+--------------------------------------+--------------------------------+-------------------+
93 rows in set (0.04 sec)











7. Write a query to get EmployeeID, Title, FirstName, LastName, and Region from the Employees table.

D3_56588>SELECT EmployeeID, Title, FirstName, LastName, Region Phone FROM employees;
+------------+--------------------------+-----------+-----------+-------+
| EmployeeID | Title                    | FirstName | LastName  | Phone |
+------------+--------------------------+-----------+-----------+-------+
|          1 | Sales Representative     | Nancy     | Davolio   | WA    |
|          2 | Vice President, Sales    | Andrew    | Fuller    | WA    |
|          3 | Sales Representative     | Janet     | Leverling | WA    |
|          4 | Sales Representative     | Margaret  | Peacock   | WA    |
|          5 | Sales Manager            | Steven    | Buchanan  | NULL  |
|          6 | Sales Representative     | Michael   | Suyama    | NULL  |
|          7 | Sales Representative     | Robert    | King      | NULL  |
|          8 | Inside Sales Coordinator | Laura     | Callahan  | WA    |
|          9 | Sales Representative     | Anne      | Dodsworth | NULL  |
+------------+--------------------------+-----------+-----------+-------+
9 rows in set (0.11 sec)














8. Write a query to get RegionID and RegionDescription from the Region table.

D3_56588>SELECT RegionID, RegionDescription FROM region;
+----------+----------------------------------------------------+
| RegionID | RegionDescription                                  |
+----------+----------------------------------------------------+
|        1 | Eastern                                            |
|        2 | Westerns                                           |
|        3 | Northern                                           |
|        4 | Southern                                           |
+----------+----------------------------------------------------+
4 rows in set (0.11 sec)












9. Write a query to get CompanyName, Fax, Phone and HomePage from the Suppliers table.

D3_56588>SELECT CompanyName, Fax, Phone, HomePage FROM suppliers;
+----------------------------------------+-----------------+-----------------+------------------------------------------------------------------------------------------------+
| CompanyName                            | Fax             | Phone           | HomePage                                                                                       |
+----------------------------------------+-----------------+-----------------+------------------------------------------------------------------------------------------------+
| Exotic Liquids                         | NULL            | (171) 555-2222  | NULL                                                                                           |
| New Orleans Cajun Delights             | NULL            | (100) 555-4822  | #CAJUN.HTM#                                                                                    |
| Grandma Kelly's Homestead              | (313) 555-3349  | (313) 555-5735  | NULL                                                                                           |
| Tokyo Traders                          | NULL            | (03) 3555-5011  | NULL                                                                                           |
| Cooperativa de Quesos 'Las Cabras'     | NULL            | (98) 598 76 54  | NULL                                                                                           |
| Mayumi's                               | NULL            | (06) 431-7877   | Mayumi's (on the World Wide Web)#http://www.microsoft.com/accessdev/sampleapps/mayumi.htm#     |
| Pavlova, Ltd.                          | (03) 444-6588   | (03) 444-2343   | NULL                                                                                           |
| Specialty Biscuits, Ltd.               | NULL            | (161) 555-4448  | NULL                                                                                           |
| PB Knckebrd AB                         | 031-987 65 91   | 031-987 65 43   | NULL                                                                                           |
| Refrescos Americanas LTDA              | NULL            | (11) 555 4640   | NULL                                                                                           |
| Heli Swaren GmbH & Co. KG              | NULL            | (010) 9984510   | NULL                                                                                           |
| Plutzer Lebensmittelgromrkte AG        | NULL            | (069) 992755    | Plutzer (on the World Wide Web)#http://www.microsoft.com/accessdev/sampleapps/plutzer.htm#     |
| Nord-Ost-Fisch Handelsgesellschaft mbH | (04721) 8714    | (04721) 8713    | NULL                                                                                           |
| Formaggi Fortini s.r.l.                | (0544) 60603    | (0544) 60323    | #FORMAGGI.HTM#                                                                                 |
| Norske Meierier                        | NULL            | (0)2-953010     | NULL                                                                                           |
| Bigfoot Breweries                      | NULL            | (503) 555-9931  | NULL                                                                                           |
| Svensk Sjfda AB                        | NULL            | 08-123 45 67    | NULL                                                                                           |
| Aux joyeux ecclsiastiques              | (1) 03.83.00.62 | (1) 03.83.00.68 | NULL                                                                                           |
| New England Seafood Cannery            | (617) 555-3389  | (617) 555-3267  | NULL                                                                                           |
| Leka Trading                           | NULL            | 555-8787        | NULL                                                                                           |
| Lyngbysild                             | 43844115        | 43844108        | NULL                                                                                           |
| Zaanse Snoepfabriek                    | (12345) 1210    | (12345) 1212    | NULL                                                                                           |
| Karkki Oy                              | NULL            | (953) 10956     | NULL                                                                                           |
| G'day, Mate                            | (02) 555-4873   | (02) 555-5914   | G'day Mate (on the World Wide Web)#http://www.microsoft.com/accessdev/sampleapps/gdaymate.htm# |
| Ma Maison                              | NULL            | (514) 555-9022  | NULL                                                                                           |
| Pasta Buttini s.r.l.                   | (089) 6547667   | (089) 6547665   | NULL                                                                                           |
| Escargots Nouveaux                     | NULL            | 85.57.00.07     | NULL                                                                                           |
| Gai pturage                            | 38.76.98.58     | 38.76.98.06     | NULL                                                                                           |
| Forts d'rables                         | (514) 555-2921  | (514) 555-2955  | NULL                                                                                           |
+----------------------------------------+-----------------+-----------------+------------------------------------------------------------------------------------------------+
29 rows in set (0.17 sec)















10. Write a query to get CategoryName and Description from the Categories table sorted by CategoryName.

D3_56588>SELECT CategoryName, Description FROM categories ORDER BY CategoryName;
+----------------+------------------------------------------------------------+
| CategoryName   | Description                                                |
+----------------+------------------------------------------------------------+
| Beverages      | Soft drinks, coffees, teas, beers, and ales                |
| Condiments     | Sweet and savory sauces, relishes, spreads, and seasonings |
| Confections    | Desserts, candies, and sweet breads                        |
| Dairy Products | Cheeses                                                    |
| Grains/Cereals | Breads, crackers, pasta, and cereal                        |
| Meat/Poultry   | Prepared meats                                             |
| Produce        | Dried fruit and bean curd                                  |
| Seafood        | Seaweed and fish                                           |
+----------------+------------------------------------------------------------+
8 rows in set (0.00 sec)













11. Write a query to get ContactName, CompanyName, ContactTitle, and Phone from the Customers table sorted by Phone.

D3_56588>SELECT ContactName, CompanyName, ContactTitle, Phone FROM customers ORDER BY Phone;
+-------------------------+--------------------------------------+--------------------------------+-------------------+
| ContactName             | CompanyName                          | ContactTitle                   | Phone             |
+-------------------------+--------------------------------------+--------------------------------+-------------------+
| Valon Hoti              | IT                                   | IT                             | NULL              |
| Val2                    | IT                                   | IT                             | NULL              |
| Catherine Dewey         | Maison Dewey                         | Sales Agent                    | (02) 201 24 67    |
| Pascale Cartrain        | Suprmes dlices                       | Accounting Manager             | (071) 23 67 22 20 |
| Sergio Gutirrez         | Rancho grande                        | Sales Representative           | (1) 123-5555      |
| Yvonne Moncada          | Ocano Atlntico Ltda.                 | Sales Agent                    | (1) 135-5333      |
| Patricio Simpson        | Cactus Comidas para llevar           | Sales Agent                    | (1) 135-5555      |
| Lino Rodriguez          | Furia Bacalhau e Frutos do Mar       | Sales Manager                  | (1) 354-2534      |
| Isabel de Castro        | Princesa Isabel Vinhos               | Sales Representative           | (1) 356-5634      |
| Marie Bertrand          | Paris spcialits                      | Owner                          | (1) 42.34.22.66   |
| Dominique Perrier       | Spcialits du monde                   | Marketing Manager              | (1) 47.55.60.10   |
| Lcia Carvalho           | Queen Cozinha                        | Marketing Assistant            | (11) 555-1189     |
| Anabela Domingues       | Tradio Hipermercados                 | Sales Representative           | (11) 555-2167     |
| Pedro Afonso            | Comrcio Mineiro                      | Sales Associate                | (11) 555-7647     |
| Andr Fonseca            | Gourmet Lanchonetes                  | Sales Associate                | (11) 555-9482     |
| Aria Cruz               | Familia Arquibaldo                   | Marketing Assistant            | (11) 555-9857     |
| Paula Parente           | Wellington Importadora               | Sales Manager                  | (14) 555-8122     |
| Ann Devon               | Eastern Connection                   | Sales Agent                    | (171) 555-0297    |
| Victoria Ashworth       | B's Beverages                        | Sales Representative           | (171) 555-1212    |
| Hari Kumar              | Seven Seas Imports                   | Sales Manager                  | (171) 555-1717    |
| Elizabeth Brown         | Consolidated Holdings                | Sales Representative           | (171) 555-2282    |
| Simon Crowther          | North/South                          | Sales Associate                | (171) 555-7733    |
| Thomas Hardy            | Around the Horn                      | Sales Representative           | (171) 555-7788    |
| Helen Bennett           | Island Trading                       | Marketing Manager              | (198) 555-8888    |
| Manuel Pereira          | GROSELLA-Restaurante                 | Owner                          | (2) 283-2951      |
| Karl Jablonski          | White Clover Markets                 | Owner                          | (206) 555-4112    |
| Helvetius Nagy          | Trail's Head Gourmet Provisioners    | Sales Associate                | (206) 555-8257    |
| Jose Pavarotti          | Save-a-lot Markets                   | Sales Representative           | (208) 555-8097    |
| Mario Pontes            | Hanari Carnes                        | Accounting Manager             | (21) 555-0091     |
| Janete Limeira          | Ricardo Adocicados                   | Assistant Sales Agent          | (21) 555-3412     |
| Bernardo Batista        | Que Delcia                           | Accounting Manager             | (21) 555-4252     |
| Zbyszek Piestrzeniewicz | Wolski  Zajazd                       | Owner                          | (26) 642-7012     |
| Art Braunschweiger      | Split Rail Beer & Ale                | Sales Manager                  | (307) 555-4680    |
| Liu Wong                | The Cracker Box                      | Marketing Assistant            | (406) 555-5834    |
| Jaime Yorres            | Let's Stop N Shop                    | Owner                          | (415) 555-5938    |
| Guillermo Fernndez      | Pericles Comidas clsicas             | Sales Representative           | (5) 552-3745      |
| Carlos Hernndez         | HILARION-Abastos                     | Sales Representative           | (5) 555-1340      |
| Miguel Angel Paolino    | Tortuga Restaurante                  | Owner                          | (5) 555-2933      |
| Francisco Chang         | Centro comercial Moctezuma           | Marketing Manager              | (5) 555-3392      |
| Antonio Moreno          | Antonio Moreno Taquera               | Owner                          | (5) 555-3932      |
| Ana Trujillo            | Ana Trujillo Emparedados y helados   | Owner                          | (5) 555-4729      |
| Liz Nixon               | The Big Cheese                       | Marketing Manager              | (503) 555-3612    |
| Yoshi Latimer           | Hungry Coyote Import Store           | Sales Representative           | (503) 555-6874    |
| Howard Snyder           | Great Lakes Food Market              | Marketing Manager              | (503) 555-7555    |
| Fran Wilson             | Lonesome Pine Restaurant             | Sales Manager                  | (503) 555-9573    |
| Paula Wilson            | Rattlesnake Canyon Grocery           | Assistant Sales Representative | (505) 555-5939    |
| John Steel              | Lazy K Kountry Store                 | Marketing Manager              | (509) 555-7969    |
| Jean Fresnire           | Mre Paillarde                        | Marketing Assistant            | (514) 555-8054    |
| Yoshi Tannamuri         | Laughing Bacchus Wine Cellars        | Marketing Assistant            | (604) 555-3392    |
| Elizabeth Lincoln       | Bottom-Dollar Markets                | Accounting Manager             | (604) 555-4729    |
| Felipe Izquierdo        | LINO-Delicateses                     | Owner                          | (8) 34-56-12      |
| Carlos Gonzlez          | LILA-Supermercado                    | Accounting Manager             | (9) 331-6954      |
| Rene Phillips           | Old World Delicatessen               | Sales Representative           | (907) 555-7584    |
| Martn Sommer            | Blido Comidas preparadas             | Owner                          | (91) 555 22 82    |
| Diego Roel              | FISSA Fabrica Inter. Salchichas S.A. | Accounting Manager             | (91) 555 94 44    |
| Alejandra Camino        | Romero y tomillo                     | Accounting Manager             | (91) 745 6200     |
| Eduardo Saavedra        | Galera del gastrnomo                 | Marketing Manager              | (93) 203 4560     |
| Jos Pedro Freyre        | Godos Cocina Tpica                   | Sales Manager                  | (95) 555 82 82    |
| Paolo Accorti           | Franchi S.p.A.                       | Sales Representative           | 011-4988260       |
| Henriette Pfalzheim     | Ottilies Kseladen                    | Owner                          | 0221-0644327      |
| Sven Ottlieb            | Drachenblut Delikatessen             | Order Administrator            | 0241-039123       |
| Karin Josephs           | Toms Spezialitten                    | Marketing Manager              | 0251-031259       |
| Maria Anders            | Alfreds Futterkiste                  | Sales Representative           | 030-0074321       |
| Alexander Feuer         | Morgenstern Gesundkost               | Marketing Assistant            | 0342-023176       |
| Giovanni Rovelli        | Magazzini Alimentari Riuniti         | Marketing Manager              | 035-640230        |
| Horst Kloss             | QUICK-Stop                           | Accounting Manager             | 0372-035188       |
| Yang Wang               | Chop-suey Chinese                    | Owner                          | 0452-076545       |
| Maurizio Moroni         | Reggiani Caseifici                   | Sales Associate                | 0522-556721       |
| Philip Cramer           | Kniglich Essen                       | Sales Associate                | 0555-09876        |
| Hanna Moos              | Blauer See Delikatessen              | Sales Representative           | 0621-08460        |
| Renate Messner          | Lehmanns Marktstand                  | Sales Representative           | 069-0245984       |
| Maria Larsson           | Folk och f HB                        | Owner                          | 0695-34 67 21     |
| Jonas Bergulfsen        | Sant Gourmet                         | Owner                          | 07-98 92 35       |
| Rita Mller              | Die Wandernde Kuh                    | Sales Representative           | 0711-020361       |
| Peter Franken           | Frankenversand                       | Marketing Manager              | 089-0877310       |
| Michael Holz            | Richter Supermarkt                   | Sales Manager                  | 0897-034214       |
| Christina Berglund      | Berglunds snabbkp                    | Order Administrator            | 0921-12 34 65     |
| Martine Ranc            | Folies gourmandes                    | Assistant Sales Agent          | 20.16.10.16       |
| Paul Henriot            | Vins et alcools Chevalier            | Accounting Manager             | 26.47.15.10       |
| Patricia McKenna        | Hungry Owl All-Night Grocers         | Sales Associate                | 2967 542          |
| Daniel Tonini           | La corne d'abondance                 | Sales Representative           | 30.59.84.10       |
| Jytte Petersen          | Simons bistro                        | Owner                          | 31 12 34 56       |
| Carine Schmitt          | France restauration                  | Marketing Manager              | 40.32.21.21       |
| Janine Labrune          | Du monde entier                      | Owner                          | 40.67.88.88       |
| Annette Roulet          | La maison d'Asie                     | Sales Manager                  | 61.77.61.10       |
| Georg Pipps             | Piccolo und mehr                     | Sales Manager                  | 6562-9722         |
| Roland Mendel           | Ernst Handel                         | Sales Manager                  | 7675-3425         |
| Mary Saveley            | Victuailles en stock                 | Sales Agent                    | 78.32.54.86       |
| Palle Ibsen             | Vaffeljernet                         | Sales Manager                  | 86 21 32 43       |
| Frdrique Citeaux        | Blondesddsl pre et fils              | Marketing Manager              | 88.60.15.31       |
| Matti Karttunen         | Wilman Kala                          | Owner/Marketing Assistant      | 90-224 8858       |
| Laurence Lebihan        | Bon app'                             | Owner                          | 91.24.45.40       |
| Pirkko Koskitalo        | Wartian Herkku                       | Accounting Manager             | 981-443655        |
+-------------------------+--------------------------------------+--------------------------------+-------------------+
93 rows in set (0.09 sec)













12. Create a report showing employees' first and last names and hire dates sorted from newest to oldest employee.

D3_56588>SELECT FirstName, LastName, HireDate FROM employees ORDER BY HireDate;
+-----------+-----------+---------------------+
| FirstName | LastName  | HireDate            |
+-----------+-----------+---------------------+
| Janet     | Leverling | 1992-04-01 00:00:00 |
| Nancy     | Davolio   | 1992-05-01 00:00:00 |
| Andrew    | Fuller    | 1992-08-14 00:00:00 |
| Margaret  | Peacock   | 1993-05-03 00:00:00 |
| Steven    | Buchanan  | 1993-10-17 00:00:00 |
| Michael   | Suyama    | 1993-10-17 00:00:00 |
| Robert    | King      | 1994-01-02 00:00:00 |
| Laura     | Callahan  | 1994-03-05 00:00:00 |
| Anne      | Dodsworth | 1994-11-15 00:00:00 |
+-----------+-----------+---------------------+
9 rows in set (0.00 sec)











13. Create a report showing Northwind's orders sorted by Freight from most expensive to cheapest. Show OrderID, OrderDate, ShippedDate, CustomerID, and Freight.

D3_56588>SELECT OrderID, OrderDate, ShippedDate, CustomerID, Freight FROM orders ORDER BY Freight DESC;
+---------+---------------------+---------------------+------------+-----------+
| OrderID | OrderDate           | ShippedDate         | CustomerID | Freight   |
+---------+---------------------+---------------------+------------+-----------+
|   10540 | 1997-05-19 00:00:00 | 1997-06-13 00:00:00 | QUICK      | 1007.6400 |
|   10372 | 1996-12-04 00:00:00 | 1996-12-09 00:00:00 | QUEEN      |  890.7800 |
|   11030 | 1998-04-17 00:00:00 | 1998-04-27 00:00:00 | SAVEA      |  830.7500 |
|   10691 | 1997-10-03 00:00:00 | 1997-10-22 00:00:00 | QUICK      |  810.0500 |
|   10514 | 1997-04-22 00:00:00 | 1997-05-16 00:00:00 | ERNSH      |  789.9500 |
|   11017 | 1998-04-13 00:00:00 | 1998-04-20 00:00:00 | ERNSH      |  754.2600 |
|   10816 | 1998-01-06 00:00:00 | 1998-02-04 00:00:00 | GREAL      |  719.7800 |
|   10479 | 1997-03-19 00:00:00 | 1997-03-21 00:00:00 | RATTC      |  708.9500 |
|   10983 | 1998-03-27 00:00:00 | 1998-04-06 00:00:00 | SAVEA      |  657.5400 |
|   11032 | 1998-04-17 00:00:00 | 1998-04-23 00:00:00 | WHITC      |  606.1900 |
|   10897 | 1998-02-19 00:00:00 | 1998-02-25 00:00:00 | HUNGO      |  603.5400 |
|   10912 | 1998-02-26 00:00:00 | 1998-03-18 00:00:00 | HUNGO      |  580.9100 |
|   10612 | 1997-07-28 00:00:00 | 1997-08-01 00:00:00 | SAVEA      |  544.0800 |
|   10847 | 1998-01-22 00:00:00 | 1998-02-10 00:00:00 | SAVEA      |  487.5700 |
|   10634 | 1997-08-15 00:00:00 | 1997-08-21 00:00:00 | FOLIG      |  487.3800 |
|   10633 | 1997-08-15 00:00:00 | 1997-08-18 00:00:00 | ERNSH      |  477.9000 |
|   10430 | 1997-01-30 00:00:00 | 1997-02-03 00:00:00 | ERNSH      |  458.7800 |
|   10841 | 1998-01-20 00:00:00 | 1998-01-29 00:00:00 | SUPRD      |  424.3000 |
|   10836 | 1998-01-16 00:00:00 | 1998-01-21 00:00:00 | ERNSH      |  411.8800 |
|   10941 | 1998-03-11 00:00:00 | 1998-03-20 00:00:00 | SAVEA      |  400.8100 |
|   10694 | 1997-10-06 00:00:00 | 1997-10-09 00:00:00 | QUICK      |  398.3600 |
|   10678 | 1997-09-23 00:00:00 | 1997-10-16 00:00:00 | SAVEA      |  388.9800 |
|   10605 | 1997-07-21 00:00:00 | 1997-07-29 00:00:00 | MEREP      |  379.1300 |
|   10424 | 1997-01-23 00:00:00 | 1997-01-27 00:00:00 | MEREP      |  370.6100 |
|   10510 | 1997-04-18 00:00:00 | 1997-04-28 00:00:00 | SAVEA      |  367.6300 |
|   10658 | 1997-09-05 00:00:00 | 1997-09-08 00:00:00 | QUICK      |  364.1500 |
|   10353 | 1996-11-13 00:00:00 | 1996-11-25 00:00:00 | PICCO      |  360.6300 |
|   10979 | 1998-03-26 00:00:00 | 1998-03-31 00:00:00 | ERNSH      |  353.0700 |
|   10657 | 1997-09-04 00:00:00 | 1997-09-15 00:00:00 | SAVEA      |  352.6900 |
|   10776 | 1997-12-15 00:00:00 | 1997-12-18 00:00:00 | ERNSH      |  351.5300 |
|   10511 | 1997-04-18 00:00:00 | 1997-04-21 00:00:00 | BONAP      |  350.6400 |
|   10865 | 1998-02-02 00:00:00 | 1998-02-12 00:00:00 | QUICK      |  348.1400 |
|   10530 | 1997-05-08 00:00:00 | 1997-05-12 00:00:00 | PICCO      |  339.2200 |
|   10762 | 1997-12-02 00:00:00 | 1997-12-09 00:00:00 | FOLKO      |  328.7400 |
|   10817 | 1998-01-06 00:00:00 | 1998-01-13 00:00:00 | KOENE      |  306.0700 |
|   10688 | 1997-10-01 00:00:00 | 1997-10-07 00:00:00 | VAFFE      |  299.0900 |
|   11021 | 1998-04-14 00:00:00 | 1998-04-21 00:00:00 | QUICK      |  297.1800 |
|   10687 | 1997-09-30 00:00:00 | 1997-10-30 00:00:00 | HUNGO      |  296.4300 |
|   10359 | 1996-11-21 00:00:00 | 1996-11-26 00:00:00 | SEVES      |  288.4300 |
|   10889 | 1998-02-16 00:00:00 | 1998-02-23 00:00:00 | RATTC      |  280.6100 |
|   11056 | 1998-04-28 00:00:00 | 1998-05-01 00:00:00 | EASTC      |  278.9600 |
|   10962 | 1998-03-19 00:00:00 | 1998-03-23 00:00:00 | QUICK      |  275.7900 |
|   10698 | 1997-10-09 00:00:00 | 1997-10-17 00:00:00 | ERNSH      |  272.4700 |
|   11072 | 1998-05-05 00:00:00 | NULL                | ERNSH      |  258.6400 |
|   10305 | 1996-09-13 00:00:00 | 1996-10-09 00:00:00 | OLDWO      |  257.6200 |
|   10802 | 1997-12-29 00:00:00 | 1998-01-02 00:00:00 | SIMOB      |  257.2600 |
|   10555 | 1997-06-02 00:00:00 | 1997-06-04 00:00:00 | SAVEA      |  252.4900 |
|   10787 | 1997-12-19 00:00:00 | 1997-12-26 00:00:00 | LAMAI      |  249.9300 |
|   10345 | 1996-11-04 00:00:00 | 1996-11-11 00:00:00 | QUICK      |  249.0600 |
|   10524 | 1997-05-01 00:00:00 | 1997-05-07 00:00:00 | BERGS      |  244.7900 |
|   10742 | 1997-11-14 00:00:00 | 1997-11-18 00:00:00 | BOTTM      |  243.7300 |
|   11012 | 1998-04-09 00:00:00 | 1998-04-17 00:00:00 | FRANK      |  242.9500 |
|   10561 | 1997-06-06 00:00:00 | 1997-06-09 00:00:00 | FOLKO      |  242.2100 |
|   10805 | 1997-12-30 00:00:00 | 1998-01-09 00:00:00 | THEBI      |  237.3400 |
|   10748 | 1997-11-20 00:00:00 | 1997-11-28 00:00:00 | SAVEA      |  232.5500 |
|   10666 | 1997-09-12 00:00:00 | 1997-09-22 00:00:00 | RICSU      |  232.4200 |
|   10286 | 1996-08-21 00:00:00 | 1996-08-30 00:00:00 | QUICK      |  229.2400 |
|   11031 | 1998-04-17 00:00:00 | 1998-04-24 00:00:00 | SAVEA      |  227.2200 |
|   10701 | 1997-10-13 00:00:00 | 1997-10-15 00:00:00 | HUNGO      |  220.3100 |
|   10518 | 1997-04-25 00:00:00 | 1997-05-05 00:00:00 | TORTU      |  218.1500 |
|   10986 | 1998-03-30 00:00:00 | 1998-04-21 00:00:00 | OCEAN      |  217.8600 |
|   10324 | 1996-10-08 00:00:00 | 1996-10-10 00:00:00 | SAVEA      |  214.2700 |
|   10845 | 1998-01-21 00:00:00 | 1998-01-30 00:00:00 | QUICK      |  212.9800 |
|   10984 | 1998-03-30 00:00:00 | 1998-04-03 00:00:00 | SAVEA      |  211.2200 |
|   10709 | 1997-10-17 00:00:00 | 1997-11-20 00:00:00 | GOURL      |  210.8000 |
|   10490 | 1997-03-31 00:00:00 | 1997-04-03 00:00:00 | HILAA      |  210.1900 |
|   10267 | 1996-07-29 00:00:00 | 1996-08-06 00:00:00 | FRANK      |  208.5800 |
|   10977 | 1998-03-26 00:00:00 | 1998-04-10 00:00:00 | FOLKO      |  208.5000 |
|   10515 | 1997-04-23 00:00:00 | 1997-05-23 00:00:00 | QUICK      |  204.4700 |
|   10670 | 1997-09-16 00:00:00 | 1997-09-18 00:00:00 | FRANK      |  203.4800 |
|   11007 | 1998-04-08 00:00:00 | 1998-04-13 00:00:00 | PRINI      |  202.2400 |
|   10637 | 1997-08-19 00:00:00 | 1997-08-26 00:00:00 | QUEEN      |  201.2900 |
|   10607 | 1997-07-22 00:00:00 | 1997-07-25 00:00:00 | SAVEA      |  200.2400 |
|   11001 | 1998-04-06 00:00:00 | 1998-04-14 00:00:00 | FOLKO      |  197.3000 |
|   10369 | 1996-12-02 00:00:00 | 1996-12-09 00:00:00 | SPLIR      |  195.6800 |
|   10546 | 1997-05-23 00:00:00 | 1997-05-27 00:00:00 | VICTE      |  194.7200 |
|   10588 | 1997-07-03 00:00:00 | 1997-07-10 00:00:00 | QUICK      |  194.6700 |
|   10981 | 1998-03-27 00:00:00 | 1998-04-02 00:00:00 | HANAR      |  193.3700 |
|   10329 | 1996-10-15 00:00:00 | 1996-10-23 00:00:00 | SPLIR      |  191.6700 |
|   10868 | 1998-02-04 00:00:00 | 1998-02-23 00:00:00 | QUEEN      |  191.2700 |
|   10451 | 1997-02-19 00:00:00 | 1997-03-12 00:00:00 | QUICK      |  189.0900 |
|   10570 | 1997-06-17 00:00:00 | 1997-06-19 00:00:00 | MEREP      |  188.9900 |
|   10857 | 1998-01-28 00:00:00 | 1998-02-06 00:00:00 | BERGS      |  188.8500 |
|   10533 | 1997-05-12 00:00:00 | 1997-05-22 00:00:00 | FOLKO      |  188.0400 |
|   10987 | 1998-03-31 00:00:00 | 1998-04-06 00:00:00 | EASTC      |  185.4800 |
|   10395 | 1996-12-26 00:00:00 | 1997-01-03 00:00:00 | HILAA      |  184.4100 |
|   10361 | 1996-11-22 00:00:00 | 1996-12-03 00:00:00 | QUICK      |  183.1700 |
|   10455 | 1997-02-24 00:00:00 | 1997-03-03 00:00:00 | WARTH      |  180.4500 |
|   10641 | 1997-08-22 00:00:00 | 1997-08-26 00:00:00 | HILAA      |  179.6100 |
|   10547 | 1997-05-23 00:00:00 | 1997-06-02 00:00:00 | SEVES      |  178.4300 |
|   10650 | 1997-08-29 00:00:00 | 1997-09-03 00:00:00 | FAMIA      |  176.8100 |
|   10921 | 1998-03-03 00:00:00 | 1998-03-09 00:00:00 | VAFFE      |  176.4800 |
|   10872 | 1998-02-05 00:00:00 | 1998-02-09 00:00:00 | GODOS      |  175.3200 |
|   10593 | 1997-07-09 00:00:00 | 1997-08-13 00:00:00 | LEHMS      |  174.2000 |
|   10852 | 1998-01-26 00:00:00 | 1998-01-30 00:00:00 | RATTC      |  174.0500 |
|   10549 | 1997-05-27 00:00:00 | 1997-05-30 00:00:00 | QUICK      |  171.2400 |
|   10855 | 1998-01-27 00:00:00 | 1998-02-04 00:00:00 | OLDWO      |  170.9700 |
|   10718 | 1997-10-27 00:00:00 | 1997-10-29 00:00:00 | KOENE      |  170.8800 |
|   10384 | 1996-12-16 00:00:00 | 1996-12-20 00:00:00 | BERGS      |  168.6400 |
|   10298 | 1996-09-05 00:00:00 | 1996-09-11 00:00:00 | HUNGO      |  168.2200 |
|   10713 | 1997-10-22 00:00:00 | 1997-10-24 00:00:00 | SAVEA      |  167.0500 |
|   10340 | 1996-10-29 00:00:00 | 1996-11-08 00:00:00 | BONAP      |  166.3100 |
|   10823 | 1998-01-09 00:00:00 | 1998-01-13 00:00:00 | LILAS      |  163.9700 |
|   10904 | 1998-02-24 00:00:00 | 1998-02-27 00:00:00 | WHITC      |  162.9500 |
|   10895 | 1998-02-18 00:00:00 | 1998-02-23 00:00:00 | ERNSH      |  162.7500 |
|   10351 | 1996-11-11 00:00:00 | 1996-11-20 00:00:00 | ERNSH      |  162.3300 |
|   10851 | 1998-01-26 00:00:00 | 1998-02-02 00:00:00 | RICAR      |  160.5500 |
|   10638 | 1997-08-20 00:00:00 | 1997-09-01 00:00:00 | LINOD      |  158.4400 |
|   10766 | 1997-12-05 00:00:00 | 1997-12-09 00:00:00 | OTTIK      |  157.5500 |
|   10436 | 1997-02-05 00:00:00 | 1997-02-11 00:00:00 | BLONP      |  156.6600 |
|   10404 | 1997-01-03 00:00:00 | 1997-01-08 00:00:00 | MAGAA      |  155.9700 |
|   10760 | 1997-12-01 00:00:00 | 1997-12-10 00:00:00 | MAISD      |  155.6400 |
|   10829 | 1998-01-13 00:00:00 | 1998-01-23 00:00:00 | ISLAT      |  154.7200 |
|   10618 | 1997-08-01 00:00:00 | 1997-08-08 00:00:00 | MEREP      |  154.6800 |
|   10703 | 1997-10-14 00:00:00 | 1997-10-20 00:00:00 | FOLKO      |  152.3000 |
|   10924 | 1998-03-04 00:00:00 | 1998-04-08 00:00:00 | BERGS      |  151.5200 |
|   10316 | 1996-09-27 00:00:00 | 1996-10-08 00:00:00 | RATTC      |  150.1500 |
|   10553 | 1997-05-30 00:00:00 | 1997-06-03 00:00:00 | WARTH      |  149.4900 |
|   11036 | 1998-04-20 00:00:00 | 1998-04-22 00:00:00 | DRACD      |  149.4700 |
|   10461 | 1997-02-28 00:00:00 | 1997-03-05 00:00:00 | LILAS      |  148.6100 |
|   10255 | 1996-07-12 00:00:00 | 1996-07-15 00:00:00 | RICSU      |  148.3300 |
|   10294 | 1996-08-30 00:00:00 | 1996-09-05 00:00:00 | RATTC      |  147.2600 |
|   10458 | 1997-02-26 00:00:00 | 1997-03-04 00:00:00 | SUPRD      |  147.0600 |
|   10768 | 1997-12-08 00:00:00 | 1997-12-15 00:00:00 | AROUT      |  146.3200 |
|   10263 | 1996-07-23 00:00:00 | 1996-07-31 00:00:00 | ERNSH      |  146.0600 |
|   10684 | 1997-09-26 00:00:00 | 1997-09-30 00:00:00 | OTTIK      |  145.6300 |
|   10764 | 1997-12-03 00:00:00 | 1997-12-08 00:00:00 | ERNSH      |  145.4500 |
|   10465 | 1997-03-05 00:00:00 | 1997-03-14 00:00:00 | VAFFE      |  145.0400 |
|   10965 | 1998-03-20 00:00:00 | 1998-03-30 00:00:00 | OLDWO      |  144.3800 |
|   10869 | 1998-02-04 00:00:00 | 1998-02-09 00:00:00 | SEVES      |  143.2800 |
|   10646 | 1997-08-27 00:00:00 | 1997-09-03 00:00:00 | HUNGO      |  142.3300 |
|   10346 | 1996-11-05 00:00:00 | 1996-11-08 00:00:00 | RATTC      |  142.0800 |
|   11002 | 1998-04-06 00:00:00 | 1998-04-16 00:00:00 | SAVEA      |  141.1600 |
|   10729 | 1997-11-04 00:00:00 | 1997-11-14 00:00:00 | LINOD      |  141.0600 |
|   10258 | 1996-07-17 00:00:00 | 1996-07-23 00:00:00 | ERNSH      |  140.5100 |
|   10452 | 1997-02-20 00:00:00 | 1997-02-26 00:00:00 | SAVEA      |  140.2600 |
|   10693 | 1997-10-06 00:00:00 | 1997-10-10 00:00:00 | WHITC      |  139.3400 |
|   10626 | 1997-08-11 00:00:00 | 1997-08-20 00:00:00 | BERGS      |  138.6900 |
|   10758 | 1997-11-28 00:00:00 | 1997-12-04 00:00:00 | RICSU      |  138.1700 |
|   10800 | 1997-12-26 00:00:00 | 1998-01-05 00:00:00 | SEVES      |  137.4400 |
|   10419 | 1997-01-20 00:00:00 | 1997-01-30 00:00:00 | RICSU      |  137.3500 |
|   10270 | 1996-08-01 00:00:00 | 1996-08-02 00:00:00 | WARTH      |  136.5400 |
|   11070 | 1998-05-05 00:00:00 | NULL                | LEHMS      |  136.0000 |
|   10706 | 1997-10-16 00:00:00 | 1997-10-21 00:00:00 | OLDWO      |  135.6300 |
|   10396 | 1996-12-27 00:00:00 | 1997-01-06 00:00:00 | FRANK      |  135.3500 |
|   10932 | 1998-03-06 00:00:00 | 1998-03-24 00:00:00 | BONAP      |  134.6400 |
|   10360 | 1996-11-22 00:00:00 | 1996-12-02 00:00:00 | BLONP      |  131.7000 |
|   10814 | 1998-01-05 00:00:00 | 1998-01-14 00:00:00 | VICTE      |  130.9400 |
|   10751 | 1997-11-24 00:00:00 | 1997-12-03 00:00:00 | RICSU      |  130.7900 |
|   10575 | 1997-06-20 00:00:00 | 1997-06-30 00:00:00 | MORGK      |  127.3400 |
|   10795 | 1997-12-24 00:00:00 | 1998-01-20 00:00:00 | ERNSH      |  126.6600 |
|   10393 | 1996-12-25 00:00:00 | 1997-01-03 00:00:00 | SAVEA      |  126.5600 |
|   10390 | 1996-12-23 00:00:00 | 1996-12-26 00:00:00 | ERNSH      |  126.3800 |
|   10277 | 1996-08-09 00:00:00 | 1996-08-13 00:00:00 | MORGK      |  125.7700 |
|   10783 | 1997-12-18 00:00:00 | 1997-12-19 00:00:00 | HANAR      |  124.9800 |
|   10373 | 1996-12-05 00:00:00 | 1996-12-11 00:00:00 | HUNGO      |  124.1200 |
|   11023 | 1998-04-14 00:00:00 | 1998-04-24 00:00:00 | BSBEV      |  123.8300 |
|   10392 | 1996-12-24 00:00:00 | 1997-01-01 00:00:00 | PICCO      |  122.4600 |
|   10971 | 1998-03-24 00:00:00 | 1998-04-02 00:00:00 | FRANR      |  121.8200 |
|   10554 | 1997-05-30 00:00:00 | 1997-06-05 00:00:00 | OTTIK      |  120.9700 |
|   11055 | 1998-04-28 00:00:00 | 1998-05-05 00:00:00 | HILAA      |  120.9200 |
|   10892 | 1998-02-17 00:00:00 | 1998-02-19 00:00:00 | MAISD      |  120.2700 |
|   10990 | 1998-04-01 00:00:00 | 1998-04-07 00:00:00 | ERNSH      |  117.6100 |
|   10747 | 1997-11-19 00:00:00 | 1997-11-26 00:00:00 | PICCO      |  117.3300 |
|   10616 | 1997-07-31 00:00:00 | 1997-08-05 00:00:00 | GREAL      |  116.5300 |
|   10572 | 1997-06-18 00:00:00 | 1997-06-25 00:00:00 | BERGS      |  116.4300 |
|   10894 | 1998-02-18 00:00:00 | 1998-02-20 00:00:00 | SAVEA      |  116.1300 |
|   10663 | 1997-09-10 00:00:00 | 1997-10-03 00:00:00 | BONAP      |  113.1500 |
|   10871 | 1998-02-05 00:00:00 | 1998-02-10 00:00:00 | BONAP      |  112.2700 |
|   10660 | 1997-09-08 00:00:00 | 1997-10-15 00:00:00 | HUNGC      |  111.2900 |
|   10786 | 1997-12-19 00:00:00 | 1997-12-23 00:00:00 | QUEEN      |  110.8700 |
|   10343 | 1996-10-31 00:00:00 | 1996-11-06 00:00:00 | LEHMS      |  110.3700 |
|   10733 | 1997-11-07 00:00:00 | 1997-11-10 00:00:00 | BERGS      |  110.1100 |
|   10866 | 1998-02-03 00:00:00 | 1998-02-12 00:00:00 | BERGS      |  109.1100 |
|   10337 | 1996-10-24 00:00:00 | 1996-10-29 00:00:00 | FRANK      |  108.2600 |
|   10406 | 1997-01-07 00:00:00 | 1997-01-13 00:00:00 | QUEEN      |  108.0400 |
|   10303 | 1996-09-11 00:00:00 | 1996-09-18 00:00:00 | GODOS      |  107.8300 |
|   10627 | 1997-08-11 00:00:00 | 1997-08-21 00:00:00 | SAVEA      |  107.4600 |
|   10659 | 1997-09-05 00:00:00 | 1997-09-10 00:00:00 | QUEEN      |  105.8100 |
|   10513 | 1997-04-22 00:00:00 | 1997-04-28 00:00:00 | WANDK      |  105.6500 |
|   10957 | 1998-03-18 00:00:00 | 1998-03-27 00:00:00 | HILAA      |  105.3600 |
|   10961 | 1998-03-19 00:00:00 | 1998-03-30 00:00:00 | QUEEN      |  104.4700 |
|   10696 | 1997-10-08 00:00:00 | 1997-10-14 00:00:00 | WHITC      |  102.5500 |
|   10499 | 1997-04-08 00:00:00 | 1997-04-16 00:00:00 | LILAS      |  102.0200 |
|   10368 | 1996-11-29 00:00:00 | 1996-12-02 00:00:00 | ERNSH      |  101.9500 |
|   10789 | 1997-12-22 00:00:00 | 1997-12-31 00:00:00 | FOLIG      |  100.6000 |
|   10854 | 1998-01-27 00:00:00 | 1998-02-05 00:00:00 | ERNSH      |  100.2200 |
|   10421 | 1997-01-21 00:00:00 | 1997-01-27 00:00:00 | QUEDE      |   99.2300 |
|   10272 | 1996-08-02 00:00:00 | 1996-08-06 00:00:00 | RATTC      |   98.0300 |
|   10623 | 1997-08-07 00:00:00 | 1997-08-12 00:00:00 | FRANK      |   97.1800 |
|   10801 | 1997-12-29 00:00:00 | 1997-12-31 00:00:00 | BOLID      |   97.0900 |
|   10595 | 1997-07-10 00:00:00 | 1997-07-14 00:00:00 | ERNSH      |   96.7800 |
|   10557 | 1997-06-03 00:00:00 | 1997-06-06 00:00:00 | LEHMS      |   96.7200 |
|   10731 | 1997-11-06 00:00:00 | 1997-11-14 00:00:00 | CHOPS      |   96.6500 |
|   10686 | 1997-09-30 00:00:00 | 1997-10-08 00:00:00 | PICCO      |   96.5000 |
|   10773 | 1997-12-11 00:00:00 | 1997-12-16 00:00:00 | ERNSH      |   96.4300 |
|   10999 | 1998-04-03 00:00:00 | 1998-04-10 00:00:00 | OTTIK      |   96.3500 |
|   10362 | 1996-11-25 00:00:00 | 1996-11-28 00:00:00 | BONAP      |   96.0400 |
|   10672 | 1997-09-17 00:00:00 | 1997-09-26 00:00:00 | BERGS      |   95.7500 |
|   10413 | 1997-01-14 00:00:00 | 1997-01-16 00:00:00 | LAMAI      |   95.6600 |
|   10624 | 1997-08-07 00:00:00 | 1997-08-19 00:00:00 | THECR      |   94.8000 |
|   10382 | 1996-12-13 00:00:00 | 1996-12-16 00:00:00 | ERNSH      |   94.7700 |
|   10387 | 1996-12-18 00:00:00 | 1996-12-20 00:00:00 | SANTG      |   93.6300 |
|   10653 | 1997-09-02 00:00:00 | 1997-09-19 00:00:00 | FRANK      |   93.2500 |
|   10278 | 1996-08-12 00:00:00 | 1996-08-16 00:00:00 | BERGS      |   92.6900 |
|   10519 | 1997-04-28 00:00:00 | 1997-05-01 00:00:00 | CHOPS      |   91.7600 |
|   10985 | 1998-03-30 00:00:00 | 1998-04-02 00:00:00 | HUNGO      |   91.5100 |
|   10407 | 1997-01-07 00:00:00 | 1997-01-30 00:00:00 | OTTIK      |   91.4800 |
|   10772 | 1997-12-10 00:00:00 | 1997-12-19 00:00:00 | LEHMS      |   91.2800 |
|   10619 | 1997-08-04 00:00:00 | 1997-08-07 00:00:00 | MEREP      |   91.0500 |
|   10884 | 1998-02-12 00:00:00 | 1998-02-13 00:00:00 | LETSS      |   90.9700 |
|   10828 | 1998-01-13 00:00:00 | 1998-02-04 00:00:00 | RANCH      |   90.8500 |
|   10712 | 1997-10-21 00:00:00 | 1997-10-31 00:00:00 | HUNGO      |   89.9300 |
|   10727 | 1997-11-03 00:00:00 | 1997-12-05 00:00:00 | REGGC      |   89.9000 |
|   10398 | 1996-12-30 00:00:00 | 1997-01-09 00:00:00 | SAVEA      |   89.1600 |
|   10464 | 1997-03-04 00:00:00 | 1997-03-14 00:00:00 | FURIB      |   89.0000 |
|   10566 | 1997-06-12 00:00:00 | 1997-06-18 00:00:00 | BLONP      |   88.4000 |
|   10880 | 1998-02-10 00:00:00 | 1998-02-18 00:00:00 | FOLKO      |   88.0100 |
|   10964 | 1998-03-20 00:00:00 | 1998-03-24 00:00:00 | SPECD      |   87.3800 |
|   10328 | 1996-10-14 00:00:00 | 1996-10-17 00:00:00 | FURIB      |   87.0300 |
|   10440 | 1997-02-10 00:00:00 | 1997-02-28 00:00:00 | SAVEA      |   86.5300 |
|   11059 | 1998-04-29 00:00:00 | NULL                | RICAR      |   85.8000 |
|   10629 | 1997-08-12 00:00:00 | 1997-08-20 00:00:00 | GODOS      |   85.4600 |
|   10573 | 1997-06-19 00:00:00 | 1997-06-20 00:00:00 | ANTON      |   84.8400 |
|   10283 | 1996-08-16 00:00:00 | 1996-08-23 00:00:00 | LILAS      |   84.8100 |
|   11033 | 1998-04-17 00:00:00 | 1998-04-23 00:00:00 | RICSU      |   84.7400 |
|   10338 | 1996-10-25 00:00:00 | 1996-10-29 00:00:00 | OLDWO      |   84.2100 |
|   10400 | 1997-01-01 00:00:00 | 1997-01-16 00:00:00 | EASTC      |   83.9300 |
|   10474 | 1997-03-13 00:00:00 | 1997-03-21 00:00:00 | PERIC      |   83.4900 |
|   10552 | 1997-05-29 00:00:00 | 1997-06-05 00:00:00 | HILAA      |   83.2200 |
|   10257 | 1996-07-16 00:00:00 | 1996-07-22 00:00:00 | HILAA      |   81.9100 |
|   10740 | 1997-11-13 00:00:00 | 1997-11-25 00:00:00 | WHITC      |   81.8800 |
|   10830 | 1998-01-13 00:00:00 | 1998-01-21 00:00:00 | TRADH      |   81.8300 |
|   11068 | 1998-05-04 00:00:00 | NULL                | QUEEN      |   81.7500 |
|   11063 | 1998-04-30 00:00:00 | 1998-05-06 00:00:00 | HUNGO      |   81.7300 |
|   10611 | 1997-07-25 00:00:00 | 1997-08-01 00:00:00 | WOLZA      |   80.6500 |
|   10290 | 1996-08-27 00:00:00 | 1996-09-03 00:00:00 | COMMI      |   79.7000 |
|   11008 | 1998-04-08 00:00:00 | NULL                | ERNSH      |   79.4600 |
|   10606 | 1997-07-22 00:00:00 | 1997-07-31 00:00:00 | TRADH      |   79.4000 |
|   10750 | 1997-11-21 00:00:00 | 1997-11-24 00:00:00 | WARTH      |   79.3000 |
|   10825 | 1998-01-09 00:00:00 | 1998-01-14 00:00:00 | DRACD      |   79.2500 |
|   10537 | 1997-05-14 00:00:00 | 1997-05-19 00:00:00 | RICSU      |   78.8500 |
|   10667 | 1997-09-12 00:00:00 | 1997-09-19 00:00:00 | ERNSH      |   78.0900 |
|   10326 | 1996-10-10 00:00:00 | 1996-10-14 00:00:00 | BOLID      |   77.9200 |
|   10893 | 1998-02-18 00:00:00 | 1998-02-20 00:00:00 | KOENE      |   77.7800 |
|   10523 | 1997-05-01 00:00:00 | 1997-05-30 00:00:00 | SEVES      |   77.6300 |
|   10285 | 1996-08-20 00:00:00 | 1996-08-26 00:00:00 | QUICK      |   76.8300 |
|   10284 | 1996-08-19 00:00:00 | 1996-08-27 00:00:00 | LEHMS      |   76.5600 |
|   10939 | 1998-03-10 00:00:00 | 1998-03-13 00:00:00 | MAGAA      |   76.3300 |
|   10681 | 1997-09-25 00:00:00 | 1997-09-30 00:00:00 | GREAL      |   76.1300 |
|   10859 | 1998-01-29 00:00:00 | 1998-02-02 00:00:00 | FRANK      |   76.1000 |
|   10273 | 1996-08-05 00:00:00 | 1996-08-12 00:00:00 | QUICK      |   76.0700 |
|   10580 | 1997-06-26 00:00:00 | 1997-07-01 00:00:00 | OTTIK      |   75.8900 |
|   10968 | 1998-03-23 00:00:00 | 1998-04-01 00:00:00 | ERNSH      |   74.6000 |
|   10722 | 1997-10-29 00:00:00 | 1997-11-04 00:00:00 | SAVEA      |   74.5800 |
|   10532 | 1997-05-09 00:00:00 | 1997-05-12 00:00:00 | EASTC      |   74.4600 |
|   10949 | 1998-03-13 00:00:00 | 1998-03-17 00:00:00 | BOTTM      |   74.4400 |
|   11024 | 1998-04-15 00:00:00 | 1998-04-20 00:00:00 | EASTC      |   74.3600 |
|   10314 | 1996-09-25 00:00:00 | 1996-10-04 00:00:00 | RATTC      |   74.1600 |
|   10997 | 1998-04-03 00:00:00 | 1998-04-13 00:00:00 | LILAS      |   73.9100 |
|   10433 | 1997-02-03 00:00:00 | 1997-03-04 00:00:00 | PRINI      |   73.8300 |
|   10403 | 1997-01-03 00:00:00 | 1997-01-09 00:00:00 | ERNSH      |   73.7900 |
|   10756 | 1997-11-27 00:00:00 | 1997-12-02 00:00:00 | SPLIR      |   73.2100 |
|   10781 | 1997-12-17 00:00:00 | 1997-12-19 00:00:00 | WARTH      |   73.1600 |
|   10441 | 1997-02-10 00:00:00 | 1997-03-14 00:00:00 | OLDWO      |   73.0200 |
|   10558 | 1997-06-04 00:00:00 | 1997-06-10 00:00:00 | AROUT      |   72.9700 |
|   10551 | 1997-05-28 00:00:00 | 1997-06-06 00:00:00 | FURIB      |   72.9500 |
|   10831 | 1998-01-14 00:00:00 | 1998-01-23 00:00:00 | SANTG      |   72.1900 |
|   10364 | 1996-11-26 00:00:00 | 1996-12-04 00:00:00 | EASTC      |   71.9700 |
|   11046 | 1998-04-23 00:00:00 | 1998-04-24 00:00:00 | WANDK      |   71.6400 |
|   10833 | 1998-01-15 00:00:00 | 1998-01-23 00:00:00 | OTTIK      |   71.4900 |
|   10487 | 1997-03-26 00:00:00 | 1997-03-28 00:00:00 | QUEEN      |   71.0700 |
|   11045 | 1998-04-23 00:00:00 | NULL                | BOTTM      |   70.5800 |
|   10417 | 1997-01-16 00:00:00 | 1997-01-28 00:00:00 | SIMOB      |   70.2900 |
|   10784 | 1997-12-18 00:00:00 | 1997-12-22 00:00:00 | MAGAA      |   70.0900 |
|   10835 | 1998-01-15 00:00:00 | 1998-01-21 00:00:00 | ALFKI      |   69.5300 |
|   10502 | 1997-04-10 00:00:00 | 1997-04-29 00:00:00 | PERIC      |   69.3200 |
|   10744 | 1997-11-17 00:00:00 | 1997-11-24 00:00:00 | VAFFE      |   69.1900 |
|   10447 | 1997-02-14 00:00:00 | 1997-03-07 00:00:00 | RICAR      |   68.6600 |
|   10541 | 1997-05-19 00:00:00 | 1997-05-29 00:00:00 | HANAR      |   68.6500 |
|   10475 | 1997-03-14 00:00:00 | 1997-04-04 00:00:00 | SUPRD      |   68.5200 |
|   10923 | 1998-03-03 00:00:00 | 1998-03-13 00:00:00 | LAMAI      |   68.2600 |
|   10402 | 1997-01-02 00:00:00 | 1997-01-10 00:00:00 | ERNSH      |   67.8800 |
|   11052 | 1998-04-27 00:00:00 | 1998-05-01 00:00:00 | HANAR      |   67.2600 |
|   10529 | 1997-05-07 00:00:00 | 1997-05-09 00:00:00 | MAISD      |   66.6900 |
|   10268 | 1996-07-30 00:00:00 | 1996-08-02 00:00:00 | GROSR      |   66.2900 |
|   10494 | 1997-04-02 00:00:00 | 1997-04-09 00:00:00 | COMMI      |   65.9900 |
|   10250 | 1996-07-08 00:00:00 | 1996-07-12 00:00:00 | HANAR      |   65.8300 |
|   10994 | 1998-04-02 00:00:00 | 1998-04-09 00:00:00 | VAFFE      |   65.5300 |
|   10818 | 1998-01-07 00:00:00 | 1998-01-12 00:00:00 | MAGAA      |   65.4800 |
|   10700 | 1997-10-10 00:00:00 | 1997-10-16 00:00:00 | SAVEA      |   65.1000 |
|   10769 | 1997-12-08 00:00:00 | 1997-12-12 00:00:00 | VAFFE      |   65.0600 |
|   11039 | 1998-04-21 00:00:00 | NULL                | LINOD      |   65.0000 |
|   10325 | 1996-10-09 00:00:00 | 1996-10-14 00:00:00 | KOENE      |   64.8600 |
|   10470 | 1997-03-11 00:00:00 | 1997-03-14 00:00:00 | BONAP      |   64.5600 |
|   10319 | 1996-10-02 00:00:00 | 1996-10-11 00:00:00 | TORTU      |   64.5000 |
|   10485 | 1997-03-25 00:00:00 | 1997-03-31 00:00:00 | LINOD      |   64.4500 |
|   10481 | 1997-03-20 00:00:00 | 1997-03-25 00:00:00 | RICAR      |   64.3300 |
|   10350 | 1996-11-11 00:00:00 | 1996-12-03 00:00:00 | LAMAI      |   64.1900 |
|   10304 | 1996-09-12 00:00:00 | 1996-09-17 00:00:00 | TORTU      |   63.7900 |
|   10916 | 1998-02-27 00:00:00 | 1998-03-09 00:00:00 | RANCH      |   63.7700 |
|   10827 | 1998-01-12 00:00:00 | 1998-02-06 00:00:00 | BONAP      |   63.5400 |
|   10327 | 1996-10-11 00:00:00 | 1996-10-14 00:00:00 | FOLKO      |   63.3600 |
|   10715 | 1997-10-23 00:00:00 | 1997-10-29 00:00:00 | BONAP      |   63.2000 |
|   10492 | 1997-04-01 00:00:00 | 1997-04-11 00:00:00 | BOTTM      |   62.8900 |
|   10516 | 1997-04-24 00:00:00 | 1997-05-01 00:00:00 | HUNGO      |   62.7800 |
|   10922 | 1998-03-03 00:00:00 | 1998-03-05 00:00:00 | HANAR      |   62.7400 |
|   10587 | 1997-07-02 00:00:00 | 1997-07-09 00:00:00 | QUEDE      |   62.5200 |
|   10967 | 1998-03-23 00:00:00 | 1998-04-02 00:00:00 | TOMSP      |   62.2200 |
|   10901 | 1998-02-23 00:00:00 | 1998-02-26 00:00:00 | HILAA      |   62.0900 |
|   10749 | 1997-11-20 00:00:00 | 1997-12-19 00:00:00 | ISLAT      |   61.5300 |
|   10988 | 1998-03-31 00:00:00 | 1998-04-10 00:00:00 | RATTC      |   61.1400 |
|   10692 | 1997-10-03 00:00:00 | 1997-10-13 00:00:00 | ALFKI      |   61.0200 |
|   10563 | 1997-06-10 00:00:00 | 1997-06-24 00:00:00 | RICAR      |   60.4300 |
|   10876 | 1998-02-09 00:00:00 | 1998-02-12 00:00:00 | BONAP      |   60.4200 |
|   10397 | 1996-12-27 00:00:00 | 1997-01-02 00:00:00 | PRINI      |   60.2600 |
|   10469 | 1997-03-10 00:00:00 | 1997-03-14 00:00:00 | WHITC      |   60.1800 |
|   10812 | 1998-01-02 00:00:00 | 1998-01-12 00:00:00 | REGGC      |   59.7800 |
|   11050 | 1998-04-27 00:00:00 | 1998-05-05 00:00:00 | FOLKO      |   59.4100 |
|   10838 | 1998-01-19 00:00:00 | 1998-01-23 00:00:00 | LINOD      |   59.2800 |
|   10717 | 1997-10-24 00:00:00 | 1997-10-29 00:00:00 | FRANK      |   59.2500 |
|   10584 | 1997-06-30 00:00:00 | 1997-07-04 00:00:00 | BLONP      |   59.1400 |
|   10504 | 1997-04-11 00:00:00 | 1997-04-18 00:00:00 | WHITC      |   59.1300 |
|   11009 | 1998-04-08 00:00:00 | 1998-04-10 00:00:00 | GODOS      |   59.1100 |
|   10569 | 1997-06-16 00:00:00 | 1997-07-11 00:00:00 | RATTC      |   58.9800 |
|   10536 | 1997-05-14 00:00:00 | 1997-06-06 00:00:00 | LEHMS      |   58.8800 |
|   10526 | 1997-05-05 00:00:00 | 1997-05-15 00:00:00 | WARTH      |   58.5900 |
|   10856 | 1998-01-28 00:00:00 | 1998-02-10 00:00:00 | ANTON      |   58.4300 |
|   10728 | 1997-11-04 00:00:00 | 1997-11-11 00:00:00 | QUEEN      |   58.3300 |
|   10601 | 1997-07-16 00:00:00 | 1997-07-22 00:00:00 | HILAA      |   58.3000 |
|   10253 | 1996-07-10 00:00:00 | 1996-07-16 00:00:00 | HANAR      |   58.1700 |
|   10779 | 1997-12-16 00:00:00 | 1998-01-14 00:00:00 | MORGK      |   58.1300 |
|   10724 | 1997-10-30 00:00:00 | 1997-11-05 00:00:00 | MEREP      |   57.7500 |
|   10656 | 1997-09-04 00:00:00 | 1997-09-10 00:00:00 | GREAL      |   57.1500 |
|   10429 | 1997-01-29 00:00:00 | 1997-02-07 00:00:00 | HUNGO      |   56.6300 |
|   10846 | 1998-01-22 00:00:00 | 1998-01-23 00:00:00 | SUPRD      |   56.4600 |
|   10591 | 1997-07-07 00:00:00 | 1997-07-16 00:00:00 | VAFFE      |   55.9200 |
|   10265 | 1996-07-25 00:00:00 | 1996-08-12 00:00:00 | BLONP      |   55.2800 |
|   10654 | 1997-09-02 00:00:00 | 1997-09-11 00:00:00 | BERGS      |   55.2600 |
|   10803 | 1997-12-30 00:00:00 | 1998-01-06 00:00:00 | WELLI      |   55.2300 |
|   11000 | 1998-04-06 00:00:00 | 1998-04-14 00:00:00 | RATTC      |   55.1200 |
|   10260 | 1996-07-19 00:00:00 | 1996-07-29 00:00:00 | OTTIK      |   55.0900 |
|   10342 | 1996-10-30 00:00:00 | 1996-11-04 00:00:00 | FRANK      |   54.8300 |
|   10842 | 1998-01-20 00:00:00 | 1998-01-29 00:00:00 | TORTU      |   54.4200 |
|   10933 | 1998-03-06 00:00:00 | 1998-03-16 00:00:00 | ISLAT      |   54.1500 |
|   10853 | 1998-01-27 00:00:00 | 1998-02-03 00:00:00 | BLAUS      |   53.8300 |
|   10354 | 1996-11-14 00:00:00 | 1996-11-20 00:00:00 | PERIC      |   53.8000 |
|   10449 | 1997-02-18 00:00:00 | 1997-02-27 00:00:00 | BLONP      |   53.3000 |
|   10862 | 1998-01-30 00:00:00 | 1998-02-02 00:00:00 | LEHMS      |   53.2300 |
|   10909 | 1998-02-26 00:00:00 | 1998-03-10 00:00:00 | SANTG      |   53.0500 |
|   11053 | 1998-04-27 00:00:00 | 1998-04-29 00:00:00 | PICCO      |   53.0500 |
|   10944 | 1998-03-12 00:00:00 | 1998-03-13 00:00:00 | BOTTM      |   52.9200 |
|   10332 | 1996-10-17 00:00:00 | 1996-10-21 00:00:00 | MEREP      |   52.8400 |
|   11027 | 1998-04-16 00:00:00 | 1998-04-20 00:00:00 | BOTTM      |   52.5200 |
|   10858 | 1998-01-29 00:00:00 | 1998-02-03 00:00:00 | LACOR      |   52.5100 |
|   10711 | 1997-10-21 00:00:00 | 1997-10-29 00:00:00 | SAVEA      |   52.4100 |
|   10888 | 1998-02-16 00:00:00 | 1998-02-23 00:00:00 | GODOS      |   51.8700 |
|   10719 | 1997-10-27 00:00:00 | 1997-11-05 00:00:00 | LETSS      |   51.4400 |
|   10252 | 1996-07-09 00:00:00 | 1996-07-11 00:00:00 | SUPRD      |   51.3000 |
|   10622 | 1997-08-06 00:00:00 | 1997-08-11 00:00:00 | RICAR      |   50.9700 |
|   10958 | 1998-03-18 00:00:00 | 1998-03-27 00:00:00 | OCEAN      |   49.5600 |
|   10850 | 1998-01-23 00:00:00 | 1998-01-30 00:00:00 | VICTE      |   49.1900 |
|   10721 | 1997-10-29 00:00:00 | 1997-10-31 00:00:00 | QUICK      |   48.9200 |
|   10918 | 1998-03-02 00:00:00 | 1998-03-11 00:00:00 | BOTTM      |   48.8300 |
|   10603 | 1997-07-18 00:00:00 | 1997-08-08 00:00:00 | SAVEA      |   48.7700 |
|   10262 | 1996-07-22 00:00:00 | 1996-07-25 00:00:00 | RATTC      |   48.2900 |
|   11041 | 1998-04-22 00:00:00 | 1998-04-28 00:00:00 | CHOPS      |   48.2200 |
|   10774 | 1997-12-11 00:00:00 | 1997-12-12 00:00:00 | FOLKO      |   48.2000 |
|   10543 | 1997-05-21 00:00:00 | 1997-05-23 00:00:00 | LILAS      |   48.1700 |
|   10442 | 1997-02-11 00:00:00 | 1997-02-18 00:00:00 | ERNSH      |   47.9400 |
|   11029 | 1998-04-16 00:00:00 | 1998-04-27 00:00:00 | CHOPS      |   47.8400 |
|   10935 | 1998-03-09 00:00:00 | 1998-03-18 00:00:00 | WELLI      |   47.5900 |
|   10635 | 1997-08-18 00:00:00 | 1997-08-21 00:00:00 | MAGAA      |   47.4600 |
|   10507 | 1997-04-15 00:00:00 | 1997-04-22 00:00:00 | ANTON      |   47.4500 |
|   10389 | 1996-12-20 00:00:00 | 1996-12-24 00:00:00 | BOTTM      |   47.4200 |
|   10813 | 1998-01-05 00:00:00 | 1998-01-09 00:00:00 | RICAR      |   47.3800 |
|   10309 | 1996-09-19 00:00:00 | 1996-10-23 00:00:00 | HUNGO      |   47.3000 |
|   10668 | 1997-09-15 00:00:00 | 1997-09-23 00:00:00 | WANDK      |   47.2200 |
|   11026 | 1998-04-15 00:00:00 | 1998-04-28 00:00:00 | FRANS      |   47.0900 |
|   10496 | 1997-04-04 00:00:00 | 1997-04-07 00:00:00 | TRADH      |   46.7700 |
|   10878 | 1998-02-10 00:00:00 | 1998-02-12 00:00:00 | QUICK      |   46.6900 |
|   11047 | 1998-04-24 00:00:00 | 1998-05-01 00:00:00 | EASTC      |   46.6200 |
|   10995 | 1998-04-02 00:00:00 | 1998-04-06 00:00:00 | PERIC      |   46.0000 |
|   10735 | 1997-11-10 00:00:00 | 1997-11-21 00:00:00 | LETSS      |   45.9700 |
|   10471 | 1997-03-11 00:00:00 | 1997-03-18 00:00:00 | BSBEV      |   45.5900 |
|   10647 | 1997-08-27 00:00:00 | 1997-09-03 00:00:00 | QUEDE      |   45.5400 |
|   10808 | 1998-01-01 00:00:00 | 1998-01-09 00:00:00 | OLDWO      |   45.5300 |
|   10697 | 1997-10-08 00:00:00 | 1997-10-14 00:00:00 | LINOD      |   45.5200 |
|   10522 | 1997-04-30 00:00:00 | 1997-05-06 00:00:00 | LEHMS      |   45.3300 |
|   10600 | 1997-07-16 00:00:00 | 1997-07-21 00:00:00 | HUNGC      |   45.1300 |
|   10301 | 1996-09-09 00:00:00 | 1996-09-17 00:00:00 | WANDK      |   45.0800 |
|   10379 | 1996-12-11 00:00:00 | 1996-12-13 00:00:00 | QUEDE      |   45.0300 |
|   11004 | 1998-04-07 00:00:00 | 1998-04-20 00:00:00 | MAISD      |   44.8400 |
|   10590 | 1997-07-07 00:00:00 | 1997-07-14 00:00:00 | MEREP      |   44.7700 |
|   11066 | 1998-05-01 00:00:00 | 1998-05-04 00:00:00 | WHITC      |   44.7200 |
|   10956 | 1998-03-17 00:00:00 | 1998-03-20 00:00:00 | BLAUS      |   44.6500 |
|   10598 | 1997-07-14 00:00:00 | 1997-07-18 00:00:00 | RATTC      |   44.4200 |
|   10431 | 1997-01-30 00:00:00 | 1997-02-07 00:00:00 | BOTTM      |   44.1700 |
|   10902 | 1998-02-23 00:00:00 | 1998-03-03 00:00:00 | FOLKO      |   44.1500 |
|   10420 | 1997-01-21 00:00:00 | 1997-01-27 00:00:00 | WELLI      |   44.1200 |
|   10468 | 1997-03-07 00:00:00 | 1997-03-12 00:00:00 | KOENE      |   44.1200 |
|   10736 | 1997-11-11 00:00:00 | 1997-11-21 00:00:00 | HUNGO      |   44.1000 |
|   10625 | 1997-08-08 00:00:00 | 1997-08-14 00:00:00 | ANATR      |   43.9000 |
|   11020 | 1998-04-14 00:00:00 | 1998-04-16 00:00:00 | OTTIK      |   43.3000 |
|   10832 | 1998-01-14 00:00:00 | 1998-01-19 00:00:00 | LAMAI      |   43.2600 |
|   10765 | 1997-12-04 00:00:00 | 1997-12-09 00:00:00 | QUICK      |   42.7400 |
|   10788 | 1997-12-22 00:00:00 | 1998-01-19 00:00:00 | QUICK      |   42.7000 |
|   10500 | 1997-04-09 00:00:00 | 1997-04-17 00:00:00 | LAMAI      |   42.6800 |
|   10780 | 1997-12-16 00:00:00 | 1997-12-25 00:00:00 | LILAS      |   42.1300 |
|   10335 | 1996-10-22 00:00:00 | 1996-10-24 00:00:00 | HUNGO      |   42.1100 |
|   10355 | 1996-11-15 00:00:00 | 1996-11-20 00:00:00 | AROUT      |   41.9500 |
|   10527 | 1997-05-05 00:00:00 | 1997-05-07 00:00:00 | QUICK      |   41.9000 |
|   10642 | 1997-08-22 00:00:00 | 1997-09-05 00:00:00 | SIMOB      |   41.8900 |
|   10315 | 1996-09-26 00:00:00 | 1996-10-03 00:00:00 | ISLAT      |   41.7600 |
|   10632 | 1997-08-14 00:00:00 | 1997-08-19 00:00:00 | WANDK      |   41.3800 |
|   10251 | 1996-07-08 00:00:00 | 1996-07-15 00:00:00 | VICTE      |   41.3400 |
|   10952 | 1998-03-16 00:00:00 | 1998-03-24 00:00:00 | ALFKI      |   40.4200 |
|   11034 | 1998-04-20 00:00:00 | 1998-04-27 00:00:00 | OLDWO      |   40.3200 |
|   10312 | 1996-09-23 00:00:00 | 1996-10-03 00:00:00 | WANDK      |   40.2600 |
|   10926 | 1998-03-04 00:00:00 | 1998-03-11 00:00:00 | ANATR      |   39.9200 |
|   10448 | 1997-02-17 00:00:00 | 1997-02-24 00:00:00 | RANCH      |   38.8200 |
|   10639 | 1997-08-20 00:00:00 | 1997-08-27 00:00:00 | SANTG      |   38.6400 |
|   10991 | 1998-04-01 00:00:00 | 1998-04-07 00:00:00 | QUICK      |   38.5100 |
|   11076 | 1998-05-06 00:00:00 | NULL                | BONAP      |   38.2800 |
|   10848 | 1998-01-23 00:00:00 | 1998-01-29 00:00:00 | CONSH      |   38.2400 |
|   10911 | 1998-02-26 00:00:00 | 1998-03-05 00:00:00 | GODOS      |   38.1900 |
|   10910 | 1998-02-26 00:00:00 | 1998-03-04 00:00:00 | WILMK      |   38.1100 |
|   10877 | 1998-02-09 00:00:00 | 1998-02-19 00:00:00 | RICAR      |   38.0600 |
|   10976 | 1998-03-25 00:00:00 | 1998-04-03 00:00:00 | HILAA      |   37.9700 |
|   10574 | 1997-06-19 00:00:00 | 1997-06-30 00:00:00 | TRAIH      |   37.6000 |
|   10820 | 1998-01-07 00:00:00 | 1998-01-13 00:00:00 | RATTC      |   37.5200 |
|   10763 | 1997-12-03 00:00:00 | 1997-12-08 00:00:00 | FOLIG      |   37.3500 |
|   10356 | 1996-11-18 00:00:00 | 1996-11-27 00:00:00 | WANDK      |   36.7100 |
|   10903 | 1998-02-24 00:00:00 | 1998-03-04 00:00:00 | HANAR      |   36.7100 |
|   10821 | 1998-01-08 00:00:00 | 1998-01-15 00:00:00 | SPLIR      |   36.6800 |
|   10560 | 1997-06-06 00:00:00 | 1997-06-09 00:00:00 | FRANK      |   36.6500 |
|   10497 | 1997-04-04 00:00:00 | 1997-04-07 00:00:00 | LEHMS      |   36.2100 |
|   10682 | 1997-09-25 00:00:00 | 1997-10-01 00:00:00 | ANTON      |   36.1300 |
|   10839 | 1998-01-19 00:00:00 | 1998-01-22 00:00:00 | TRADH      |   35.4300 |
|   10597 | 1997-07-11 00:00:00 | 1997-07-18 00:00:00 | PICCO      |   35.1200 |
|   10380 | 1996-12-12 00:00:00 | 1997-01-16 00:00:00 | HUNGO      |   35.0300 |
|   10357 | 1996-11-19 00:00:00 | 1996-12-02 00:00:00 | LILAS      |   34.8800 |
|   10388 | 1996-12-19 00:00:00 | 1996-12-20 00:00:00 | SEVES      |   34.8600 |
|   10405 | 1997-01-06 00:00:00 | 1997-01-22 00:00:00 | LINOD      |   34.8200 |
|   10989 | 1998-03-31 00:00:00 | 1998-04-02 00:00:00 | QUEDE      |   34.7600 |
|   10320 | 1996-10-03 00:00:00 | 1996-10-18 00:00:00 | WARTH      |   34.5700 |
|   10383 | 1996-12-16 00:00:00 | 1996-12-18 00:00:00 | AROUT      |   34.2400 |
|   10567 | 1997-06-12 00:00:00 | 1997-06-17 00:00:00 | HUNGO      |   33.9700 |
|   10929 | 1998-03-05 00:00:00 | 1998-03-12 00:00:00 | FRANK      |   33.9300 |
|   11016 | 1998-04-10 00:00:00 | 1998-04-13 00:00:00 | AROUT      |   33.8000 |
|   10685 | 1997-09-29 00:00:00 | 1997-10-03 00:00:00 | GOURL      |   33.7500 |
|   10936 | 1998-03-09 00:00:00 | 1998-03-18 00:00:00 | GREAL      |   33.6800 |
|   10797 | 1997-12-25 00:00:00 | 1998-01-05 00:00:00 | DRACD      |   33.3500 |
|   10913 | 1998-02-26 00:00:00 | 1998-03-04 00:00:00 | QUEEN      |   33.0500 |
|   11013 | 1998-04-09 00:00:00 | 1998-04-10 00:00:00 | ROMEY      |   32.9900 |
|   10908 | 1998-02-26 00:00:00 | 1998-03-06 00:00:00 | REGGC      |   32.9600 |
|   10978 | 1998-03-26 00:00:00 | 1998-04-23 00:00:00 | MAISD      |   32.8200 |
|   10890 | 1998-02-16 00:00:00 | 1998-02-18 00:00:00 | DUMON      |   32.7600 |
|   10896 | 1998-02-19 00:00:00 | 1998-02-27 00:00:00 | MAISD      |   32.4500 |
|   10248 | 1996-07-04 00:00:00 | 1996-07-16 00:00:00 | VINET      |   32.3800 |
|   10875 | 1998-02-06 00:00:00 | 1998-03-03 00:00:00 | BERGS      |   32.3700 |
|   10630 | 1997-08-13 00:00:00 | 1997-08-19 00:00:00 | KOENE      |   32.3500 |
|   10975 | 1998-03-25 00:00:00 | 1998-03-27 00:00:00 | BOTTM      |   32.2700 |
|   10592 | 1997-07-08 00:00:00 | 1997-07-16 00:00:00 | LEHMS      |   32.1000 |
|   10517 | 1997-04-24 00:00:00 | 1997-04-29 00:00:00 | NORTS      |   32.0700 |
|   10934 | 1998-03-09 00:00:00 | 1998-03-12 00:00:00 | LEHMS      |   32.0100 |
|   10938 | 1998-03-10 00:00:00 | 1998-03-16 00:00:00 | QUICK      |   31.8900 |
|   10675 | 1997-09-19 00:00:00 | 1997-09-23 00:00:00 | FRANK      |   31.8500 |
|   10937 | 1998-03-10 00:00:00 | 1998-03-13 00:00:00 | CACTU      |   31.5100 |
|   10746 | 1997-11-19 00:00:00 | 1997-11-21 00:00:00 | CHOPS      |   31.4300 |
|   10427 | 1997-01-27 00:00:00 | 1997-03-03 00:00:00 | PICCO      |   31.2900 |
|   10811 | 1998-01-02 00:00:00 | 1998-01-08 00:00:00 | LINOD      |   31.2200 |
|   11058 | 1998-04-29 00:00:00 | NULL                | BLAUS      |   31.1400 |
|   10385 | 1996-12-17 00:00:00 | 1996-12-23 00:00:00 | SPLIR      |   30.9600 |
|   10951 | 1998-03-16 00:00:00 | 1998-04-07 00:00:00 | RICSU      |   30.8500 |
|   10799 | 1997-12-26 00:00:00 | 1998-01-05 00:00:00 | KOENE      |   30.7600 |
|   10363 | 1996-11-26 00:00:00 | 1996-12-04 00:00:00 | DRACD      |   30.5400 |
|   10486 | 1997-03-26 00:00:00 | 1997-04-02 00:00:00 | HILAA      |   30.5300 |
|   10628 | 1997-08-12 00:00:00 | 1997-08-20 00:00:00 | BLONP      |   30.3600 |
|   10394 | 1996-12-25 00:00:00 | 1997-01-03 00:00:00 | HUNGC      |   30.3400 |
|   10671 | 1997-09-17 00:00:00 | 1997-09-24 00:00:00 | FRANR      |   30.3400 |
|   10863 | 1998-02-02 00:00:00 | 1998-02-17 00:00:00 | HILAA      |   30.2600 |
|   11064 | 1998-05-01 00:00:00 | 1998-05-04 00:00:00 | SAVEA      |   30.0900 |
|   11042 | 1998-04-22 00:00:00 | 1998-05-01 00:00:00 | COMMI      |   29.9900 |
|   10599 | 1997-07-15 00:00:00 | 1997-07-21 00:00:00 | BSBEV      |   29.9800 |
|   11062 | 1998-04-30 00:00:00 | NULL                | REGGC      |   29.9300 |
|   10409 | 1997-01-09 00:00:00 | 1997-01-14 00:00:00 | OCEAN      |   29.8300 |
|   10834 | 1998-01-15 00:00:00 | 1998-01-19 00:00:00 | TRADH      |   29.7800 |
|   10299 | 1996-09-06 00:00:00 | 1996-09-13 00:00:00 | RICAR      |   29.7600 |
|   10498 | 1997-04-07 00:00:00 | 1997-04-11 00:00:00 | HILAA      |   29.7500 |
|   10920 | 1998-03-03 00:00:00 | 1998-03-09 00:00:00 | AROUT      |   29.6100 |
|   10578 | 1997-06-24 00:00:00 | 1997-07-25 00:00:00 | BSBEV      |   29.6000 |
|   11028 | 1998-04-16 00:00:00 | 1998-04-22 00:00:00 | KOENE      |   29.5900 |
|   11038 | 1998-04-21 00:00:00 | 1998-04-30 00:00:00 | SUPRD      |   29.5900 |
|   10643 | 1997-08-25 00:00:00 | 1997-09-02 00:00:00 | ALFKI      |   29.4600 |
|   11025 | 1998-04-15 00:00:00 | 1998-04-24 00:00:00 | WARTH      |   29.1700 |
|   11010 | 1998-04-09 00:00:00 | 1998-04-21 00:00:00 | REGGC      |   28.7100 |
|   10790 | 1997-12-22 00:00:00 | 1997-12-26 00:00:00 | GOURL      |   28.2300 |
|   10534 | 1997-05-12 00:00:00 | 1997-05-14 00:00:00 | LEHMS      |   27.9400 |
|   10679 | 1997-09-23 00:00:00 | 1997-09-30 00:00:00 | BLONP      |   27.9400 |
|   10954 | 1998-03-17 00:00:00 | 1998-03-20 00:00:00 | LINOD      |   27.9100 |
|   10608 | 1997-07-23 00:00:00 | 1997-08-01 00:00:00 | TOMSP      |   27.7900 |
|   10582 | 1997-06-27 00:00:00 | 1997-07-14 00:00:00 | BLAUS      |   27.7100 |
|   10399 | 1996-12-31 00:00:00 | 1997-01-08 00:00:00 | VAFFE      |   27.3600 |
|   10804 | 1997-12-30 00:00:00 | 1998-01-07 00:00:00 | SEVES      |   27.3300 |
|   10946 | 1998-03-12 00:00:00 | 1998-03-19 00:00:00 | VAFFE      |   27.2000 |
|   10966 | 1998-03-20 00:00:00 | 1998-04-08 00:00:00 | CHOPS      |   27.1900 |
|   10275 | 1996-08-07 00:00:00 | 1996-08-09 00:00:00 | MAGAA      |   26.9300 |
|   10341 | 1996-10-29 00:00:00 | 1996-11-05 00:00:00 | SIMOB      |   26.7800 |
|   10610 | 1997-07-25 00:00:00 | 1997-08-06 00:00:00 | LAMAI      |   26.7800 |
|   10680 | 1997-09-24 00:00:00 | 1997-09-26 00:00:00 | OLDWO      |   26.6100 |
|   10796 | 1997-12-25 00:00:00 | 1998-01-14 00:00:00 | HILAA      |   26.5200 |
|   10665 | 1997-09-11 00:00:00 | 1997-09-17 00:00:00 | LONEP      |   26.3100 |
|   10906 | 1998-02-25 00:00:00 | 1998-03-03 00:00:00 | WOLZA      |   26.2900 |
|   10571 | 1997-06-17 00:00:00 | 1997-07-04 00:00:00 | ERNSH      |   26.0600 |
|   10279 | 1996-08-13 00:00:00 | 1996-08-16 00:00:00 | LEHMS      |   25.8300 |
|   10266 | 1996-07-26 00:00:00 | 1996-07-31 00:00:00 | WARTH      |   25.7300 |
|   10577 | 1997-06-23 00:00:00 | 1997-06-30 00:00:00 | TRAIH      |   25.4100 |
|   10453 | 1997-02-21 00:00:00 | 1997-02-26 00:00:00 | AROUT      |   25.3600 |
|   10844 | 1998-01-21 00:00:00 | 1998-01-26 00:00:00 | PICCO      |   25.2200 |
|   11006 | 1998-04-07 00:00:00 | 1998-04-15 00:00:00 | GREAL      |   25.1900 |
|   10459 | 1997-02-27 00:00:00 | 1997-02-28 00:00:00 | VICTE      |   25.0900 |
|   11073 | 1998-05-05 00:00:00 | NULL                | PERIC      |   24.9500 |
|   10544 | 1997-05-21 00:00:00 | 1997-05-30 00:00:00 | LONEP      |   24.9100 |
|   10311 | 1996-09-20 00:00:00 | 1996-09-26 00:00:00 | DUMON      |   24.6900 |
|   10423 | 1997-01-23 00:00:00 | 1997-02-24 00:00:00 | GOURL      |   24.5000 |
|   10714 | 1997-10-22 00:00:00 | 1997-10-27 00:00:00 | SAVEA      |   24.4900 |
|   10669 | 1997-09-15 00:00:00 | 1997-09-22 00:00:00 | SIMOB      |   24.3900 |
|   11048 | 1998-04-24 00:00:00 | 1998-04-30 00:00:00 | BOTTM      |   24.1200 |
|   10702 | 1997-10-13 00:00:00 | 1997-10-21 00:00:00 | ALFKI      |   23.9400 |
|   10792 | 1997-12-23 00:00:00 | 1997-12-31 00:00:00 | WOLZA      |   23.7900 |
|   10621 | 1997-08-05 00:00:00 | 1997-08-11 00:00:00 | ISLAT      |   23.7300 |
|   10743 | 1997-11-17 00:00:00 | 1997-11-21 00:00:00 | AROUT      |   23.7200 |
|   10953 | 1998-03-16 00:00:00 | 1998-03-25 00:00:00 | AROUT      |   23.7200 |
|   10411 | 1997-01-10 00:00:00 | 1997-01-21 00:00:00 | BOTTM      |   23.6500 |
|   11014 | 1998-04-10 00:00:00 | 1998-04-15 00:00:00 | LINOD      |   23.6000 |
|   10640 | 1997-08-21 00:00:00 | 1997-08-28 00:00:00 | WANDK      |   23.5500 |
|   10948 | 1998-03-13 00:00:00 | 1998-03-19 00:00:00 | GODOS      |   23.3900 |
|   10344 | 1996-11-01 00:00:00 | 1996-11-05 00:00:00 | WHITC      |   23.2900 |
|   10882 | 1998-02-11 00:00:00 | 1998-02-20 00:00:00 | SAVEA      |   23.1000 |
|   10254 | 1996-07-11 00:00:00 | 1996-07-23 00:00:00 | CHOPS      |   22.9800 |
|   10562 | 1997-06-09 00:00:00 | 1997-06-12 00:00:00 | REGGC      |   22.9500 |
|   10289 | 1996-08-26 00:00:00 | 1996-08-28 00:00:00 | BSBEV      |   22.7700 |
|   10673 | 1997-09-18 00:00:00 | 1997-09-19 00:00:00 | WILMK      |   22.7600 |
|   10416 | 1997-01-16 00:00:00 | 1997-01-27 00:00:00 | WARTH      |   22.7200 |
|   10716 | 1997-10-24 00:00:00 | 1997-10-27 00:00:00 | RANCH      |   22.5700 |
|   10377 | 1996-12-09 00:00:00 | 1996-12-13 00:00:00 | SEVES      |   22.2100 |
|   10806 | 1997-12-31 00:00:00 | 1998-01-05 00:00:00 | VICTE      |   22.1100 |
|   10365 | 1996-11-27 00:00:00 | 1996-12-02 00:00:00 | ANTON      |   22.0000 |
|   10707 | 1997-10-16 00:00:00 | 1997-10-23 00:00:00 | AROUT      |   21.7400 |
|   10723 | 1997-10-30 00:00:00 | 1997-11-25 00:00:00 | WHITC      |   21.7200 |
|   10794 | 1997-12-24 00:00:00 | 1998-01-02 00:00:00 | QUEDE      |   21.4900 |
|   10414 | 1997-01-14 00:00:00 | 1997-01-17 00:00:00 | FAMIA      |   21.4800 |
|   10506 | 1997-04-15 00:00:00 | 1997-05-02 00:00:00 | KOENE      |   21.1900 |
|   10914 | 1998-02-27 00:00:00 | 1998-03-02 00:00:00 | QUEEN      |   21.1900 |
|   10293 | 1996-08-29 00:00:00 | 1996-09-11 00:00:00 | TORTU      |   21.1800 |
|   10651 | 1997-09-01 00:00:00 | 1997-09-11 00:00:00 | WANDK      |   20.6000 |
|   10376 | 1996-12-09 00:00:00 | 1996-12-13 00:00:00 | MEREP      |   20.3900 |
|   10891 | 1998-02-17 00:00:00 | 1998-02-19 00:00:00 | LEHMS      |   20.3700 |
|   10998 | 1998-04-03 00:00:00 | 1998-04-17 00:00:00 | WOLZA      |   20.3100 |
|   10775 | 1997-12-12 00:00:00 | 1997-12-26 00:00:00 | THECR      |   20.2500 |
|   10375 | 1996-12-06 00:00:00 | 1996-12-09 00:00:00 | HUNGC      |   20.1200 |
|   10730 | 1997-11-05 00:00:00 | 1997-11-14 00:00:00 | BONAP      |   20.1200 |
|   10437 | 1997-02-05 00:00:00 | 1997-02-12 00:00:00 | WARTH      |   19.9700 |
|   10919 | 1998-03-02 00:00:00 | 1998-03-04 00:00:00 | LINOD      |   19.8000 |
|   10927 | 1998-03-05 00:00:00 | 1998-04-08 00:00:00 | LACOR      |   19.7900 |
|   10940 | 1998-03-11 00:00:00 | 1998-03-23 00:00:00 | BONAP      |   19.7700 |
|   10819 | 1998-01-07 00:00:00 | 1998-01-16 00:00:00 | CACTU      |   19.7600 |
|   10358 | 1996-11-20 00:00:00 | 1996-11-27 00:00:00 | LAMAI      |   19.6400 |
|   10874 | 1998-02-06 00:00:00 | 1998-02-11 00:00:00 | GODOS      |   19.5800 |
|   10860 | 1998-01-29 00:00:00 | 1998-02-04 00:00:00 | FRANR      |   19.2600 |
|   11040 | 1998-04-22 00:00:00 | NULL                | GREAL      |   18.8400 |
|   10426 | 1997-01-27 00:00:00 | 1997-02-06 00:00:00 | GALED      |   18.6900 |
|   10761 | 1997-12-02 00:00:00 | 1997-12-08 00:00:00 | RATTC      |   18.6600 |
|   10576 | 1997-06-23 00:00:00 | 1997-06-30 00:00:00 | TORTU      |   18.5600 |
|   10617 | 1997-07-31 00:00:00 | 1997-08-04 00:00:00 | GREAL      |   18.5300 |
|   11074 | 1998-05-06 00:00:00 | NULL                | SIMOB      |   18.4400 |
|   10942 | 1998-03-11 00:00:00 | 1998-03-18 00:00:00 | REGGC      |   17.9500 |
|   10434 | 1997-02-03 00:00:00 | 1997-02-13 00:00:00 | FOLKO      |   17.9200 |
|   10300 | 1996-09-09 00:00:00 | 1996-09-18 00:00:00 | MAGAA      |   17.6800 |
|   10418 | 1997-01-17 00:00:00 | 1997-01-24 00:00:00 | QUICK      |   17.5500 |
|   10661 | 1997-09-09 00:00:00 | 1997-09-15 00:00:00 | HUNGO      |   17.5500 |
|   10310 | 1996-09-20 00:00:00 | 1996-09-27 00:00:00 | THEBI      |   17.5200 |
|   10521 | 1997-04-29 00:00:00 | 1997-05-02 00:00:00 | CACTU      |   17.2200 |
|   10732 | 1997-11-06 00:00:00 | 1997-11-07 00:00:00 | BONAP      |   16.9700 |
|   10491 | 1997-03-31 00:00:00 | 1997-04-08 00:00:00 | FURIB      |   16.9600 |
|   10791 | 1997-12-23 00:00:00 | 1998-01-01 00:00:00 | FRANK      |   16.8500 |
|   10503 | 1997-04-11 00:00:00 | 1997-04-16 00:00:00 | HUNGO      |   16.7400 |
|   10695 | 1997-10-07 00:00:00 | 1997-10-14 00:00:00 | WILMK      |   16.7200 |
|   10755 | 1997-11-26 00:00:00 | 1997-11-28 00:00:00 | BONAP      |   16.7100 |
|   10726 | 1997-11-03 00:00:00 | 1997-12-05 00:00:00 | EASTC      |   16.5600 |
|   10473 | 1997-03-13 00:00:00 | 1997-03-21 00:00:00 | ISLAT      |   16.3700 |
|   10596 | 1997-07-11 00:00:00 | 1997-08-12 00:00:00 | WHITC      |   16.3400 |
|   10460 | 1997-02-28 00:00:00 | 1997-03-03 00:00:00 | FOLKO      |   16.2700 |
|   10970 | 1998-03-24 00:00:00 | 1998-04-24 00:00:00 | BOLID      |   16.1600 |
|   10690 | 1997-10-02 00:00:00 | 1997-10-03 00:00:00 | HANAR      |   15.8000 |
|   11069 | 1998-05-04 00:00:00 | 1998-05-06 00:00:00 | TORTU      |   15.6700 |
|   10339 | 1996-10-28 00:00:00 | 1996-11-04 00:00:00 | MEREP      |   15.6600 |
|   10535 | 1997-05-13 00:00:00 | 1997-05-21 00:00:00 | ANTON      |   15.6400 |
|   10930 | 1998-03-06 00:00:00 | 1998-03-18 00:00:00 | SUPRD      |   15.5500 |
|   10336 | 1996-10-23 00:00:00 | 1996-10-25 00:00:00 | PRINI      |   15.5100 |
|   10483 | 1997-03-24 00:00:00 | 1997-04-25 00:00:00 | WHITC      |   15.2800 |
|   10973 | 1998-03-24 00:00:00 | 1998-03-27 00:00:00 | LACOR      |   15.1700 |
|   10861 | 1998-01-30 00:00:00 | 1998-02-17 00:00:00 | WHITC      |   14.9300 |
|   11003 | 1998-04-06 00:00:00 | 1998-04-08 00:00:00 | THECR      |   14.9100 |
|   10463 | 1997-03-04 00:00:00 | 1997-03-06 00:00:00 | SUPRD      |   14.7800 |
|   10446 | 1997-02-14 00:00:00 | 1997-02-19 00:00:00 | TOMSP      |   14.6800 |
|   10815 | 1998-01-05 00:00:00 | 1998-01-14 00:00:00 | SAVEA      |   14.6200 |
|   10648 | 1997-08-28 00:00:00 | 1997-09-09 00:00:00 | RICAR      |   14.2500 |
|   10982 | 1998-03-27 00:00:00 | 1998-04-08 00:00:00 | BOTTM      |   14.0100 |
|   11061 | 1998-04-30 00:00:00 | NULL                | GREAL      |   14.0100 |
|   10386 | 1996-12-18 00:00:00 | 1996-12-25 00:00:00 | FAMIA      |   13.9900 |
|   10256 | 1996-07-15 00:00:00 | 1996-07-17 00:00:00 | WELLI      |   13.9700 |
|   10443 | 1997-02-12 00:00:00 | 1997-02-14 00:00:00 | REGGC      |   13.9500 |
|   10276 | 1996-08-08 00:00:00 | 1996-08-14 00:00:00 | TORTU      |   13.8400 |
|   10564 | 1997-06-10 00:00:00 | 1997-06-16 00:00:00 | RATTC      |   13.7500 |
|   10579 | 1997-06-25 00:00:00 | 1997-07-04 00:00:00 | LETSS      |   13.7300 |
|   10905 | 1998-02-24 00:00:00 | 1998-03-06 00:00:00 | WELLI      |   13.7200 |
|   10931 | 1998-03-06 00:00:00 | 1998-03-19 00:00:00 | RICSU      |   13.6000 |
|   10367 | 1996-11-28 00:00:00 | 1996-12-02 00:00:00 | VAFFE      |   13.5500 |
|   10689 | 1997-10-01 00:00:00 | 1997-10-07 00:00:00 | BERGS      |   13.4200 |
|   10585 | 1997-07-01 00:00:00 | 1997-07-10 00:00:00 | WELLI      |   13.4100 |
|   10520 | 1997-04-29 00:00:00 | 1997-05-01 00:00:00 | SANTG      |   13.3700 |
|   10837 | 1998-01-16 00:00:00 | 1998-01-23 00:00:00 | BERGS      |   13.3200 |
|   10477 | 1997-03-17 00:00:00 | 1997-03-25 00:00:00 | PRINI      |   13.0200 |
|   10974 | 1998-03-25 00:00:00 | 1998-04-03 00:00:00 | SPLIR      |   12.9600 |
|   11065 | 1998-05-01 00:00:00 | NULL                | LILAS      |   12.9100 |
|   10287 | 1996-08-22 00:00:00 | 1996-08-28 00:00:00 | RICAR      |   12.7600 |
|   10330 | 1996-10-16 00:00:00 | 1996-10-28 00:00:00 | LILAS      |   12.7500 |
|   10282 | 1996-08-15 00:00:00 | 1996-08-21 00:00:00 | ROMEY      |   12.6900 |
|   10317 | 1996-09-30 00:00:00 | 1996-10-10 00:00:00 | LONEP      |   12.6900 |
|   10401 | 1997-01-01 00:00:00 | 1997-01-10 00:00:00 | RATTC      |   12.5100 |
|   10645 | 1997-08-26 00:00:00 | 1997-09-02 00:00:00 | HANAR      |   12.4100 |
|   10539 | 1997-05-16 00:00:00 | 1997-05-23 00:00:00 | BSBEV      |   12.3600 |
|   10870 | 1998-02-04 00:00:00 | 1998-02-13 00:00:00 | WOLZA      |   12.0400 |
|   10759 | 1997-11-28 00:00:00 | 1997-12-12 00:00:00 | ANATR      |   11.9900 |
|   10466 | 1997-03-06 00:00:00 | 1997-03-13 00:00:00 | COMMI      |   11.9300 |
|   10545 | 1997-05-22 00:00:00 | 1997-06-26 00:00:00 | LAZYK      |   11.9200 |
|   11018 | 1998-04-13 00:00:00 | 1998-04-16 00:00:00 | LONEP      |   11.6500 |
|   10249 | 1996-07-05 00:00:00 | 1996-07-10 00:00:00 | TOMSP      |   11.6100 |
|   10457 | 1997-02-25 00:00:00 | 1997-03-03 00:00:00 | KOENE      |   11.5700 |
|   10408 | 1997-01-08 00:00:00 | 1997-01-14 00:00:00 | FOLIG      |   11.2600 |
|   10771 | 1997-12-10 00:00:00 | 1998-01-02 00:00:00 | ERNSH      |   11.1900 |
|   10428 | 1997-01-28 00:00:00 | 1997-02-04 00:00:00 | REGGC      |   11.0900 |
|   10739 | 1997-11-12 00:00:00 | 1997-11-17 00:00:00 | VINET      |   11.0800 |
|   10525 | 1997-05-02 00:00:00 | 1997-05-23 00:00:00 | BONAP      |   11.0600 |
|   11060 | 1998-04-30 00:00:00 | 1998-05-04 00:00:00 | FRANS      |   10.9800 |
|   10741 | 1997-11-14 00:00:00 | 1997-11-18 00:00:00 | AROUT      |   10.9600 |
|   10542 | 1997-05-20 00:00:00 | 1997-05-26 00:00:00 | KOENE      |   10.9500 |
|   10725 | 1997-10-31 00:00:00 | 1997-11-05 00:00:00 | FAMIA      |   10.8300 |
|   10493 | 1997-04-02 00:00:00 | 1997-04-10 00:00:00 | LAMAI      |   10.6400 |
|   10945 | 1998-03-12 00:00:00 | 1998-03-18 00:00:00 | MORGK      |   10.2200 |
|   10331 | 1996-10-16 00:00:00 | 1996-10-21 00:00:00 | BONAP      |   10.1900 |
|   10366 | 1996-11-28 00:00:00 | 1996-12-30 00:00:00 | GALED      |   10.1400 |
|   10556 | 1997-06-03 00:00:00 | 1997-06-13 00:00:00 | SIMOB      |    9.8000 |
|   10720 | 1997-10-28 00:00:00 | 1997-11-05 00:00:00 | QUEDE      |    9.5300 |
|   10445 | 1997-02-13 00:00:00 | 1997-02-20 00:00:00 | BERGS      |    9.3000 |
|   10843 | 1998-01-21 00:00:00 | 1998-01-26 00:00:00 | VICTE      |    9.2600 |
|   10435 | 1997-02-04 00:00:00 | 1997-02-07 00:00:00 | CONSH      |    9.2100 |
|   10907 | 1998-02-25 00:00:00 | 1998-02-27 00:00:00 | SPECD      |    9.1900 |
|   10280 | 1996-08-14 00:00:00 | 1996-09-12 00:00:00 | BERGS      |    8.9800 |
|   10501 | 1997-04-09 00:00:00 | 1997-04-16 00:00:00 | BLAUS      |    8.8500 |
|   10993 | 1998-04-01 00:00:00 | 1998-04-10 00:00:00 | FOLKO      |    8.8100 |
|   11043 | 1998-04-22 00:00:00 | 1998-04-29 00:00:00 | SPECD      |    8.8000 |
|   11044 | 1998-04-23 00:00:00 | 1998-05-01 00:00:00 | WOLZA      |    8.7200 |
|   10349 | 1996-11-08 00:00:00 | 1996-11-15 00:00:00 | SPLIR      |    8.6300 |
|   10334 | 1996-10-21 00:00:00 | 1996-10-28 00:00:00 | VICTE      |    8.5600 |
|   11077 | 1998-05-06 00:00:00 | NULL                | RATTC      |    8.5300 |
|   10879 | 1998-02-10 00:00:00 | 1998-02-12 00:00:00 | WILMK      |    8.5000 |
|   11049 | 1998-04-24 00:00:00 | 1998-05-04 00:00:00 | GOURL      |    8.3400 |
|   10917 | 1998-03-02 00:00:00 | 1998-03-11 00:00:00 | ROMEY      |    8.2900 |
|   10438 | 1997-02-06 00:00:00 | 1997-02-14 00:00:00 | TOMSP      |    8.2400 |
|   10757 | 1997-11-27 00:00:00 | 1997-12-15 00:00:00 | SAVEA      |    8.1900 |
|   10456 | 1997-02-25 00:00:00 | 1997-02-28 00:00:00 | KOENE      |    8.1200 |
|   10531 | 1997-05-08 00:00:00 | 1997-05-19 00:00:00 | OCEAN      |    8.1200 |
|   10613 | 1997-07-29 00:00:00 | 1997-08-01 00:00:00 | HILAA      |    8.1100 |
|   10559 | 1997-06-05 00:00:00 | 1997-06-13 00:00:00 | BLONP      |    8.0500 |
|   10381 | 1996-12-12 00:00:00 | 1996-12-13 00:00:00 | LILAS      |    7.9900 |
|   11067 | 1998-05-04 00:00:00 | 1998-05-06 00:00:00 | DRACD      |    7.9800 |
|   10425 | 1997-01-24 00:00:00 | 1997-02-14 00:00:00 | LAMAI      |    7.9300 |
|   10737 | 1997-11-11 00:00:00 | 1997-11-18 00:00:00 | VINET      |    7.7900 |
|   10753 | 1997-11-25 00:00:00 | 1997-11-27 00:00:00 | FRANS      |    7.7000 |
|   10306 | 1996-09-16 00:00:00 | 1996-09-23 00:00:00 | ROMEY      |    7.5600 |
|   10482 | 1997-03-21 00:00:00 | 1997-04-10 00:00:00 | LAZYK      |    7.4800 |
|   10604 | 1997-07-18 00:00:00 | 1997-07-29 00:00:00 | FURIB      |    7.4600 |
|   10288 | 1996-08-23 00:00:00 | 1996-09-03 00:00:00 | REGGC      |    7.4500 |
|   10583 | 1997-06-30 00:00:00 | 1997-07-04 00:00:00 | WARTH      |    7.2800 |
|   10450 | 1997-02-19 00:00:00 | 1997-03-11 00:00:00 | VICTE      |    7.2300 |
|   10565 | 1997-06-11 00:00:00 | 1997-06-18 00:00:00 | MEREP      |    7.1500 |
|   10652 | 1997-09-01 00:00:00 | 1997-09-08 00:00:00 | GOURL      |    7.1400 |
|   10505 | 1997-04-14 00:00:00 | 1997-04-21 00:00:00 | MEREP      |    7.1300 |
|   10826 | 1998-01-12 00:00:00 | 1998-02-06 00:00:00 | BLONP      |    7.0900 |
|   10822 | 1998-01-08 00:00:00 | 1998-01-16 00:00:00 | TRAIH      |    7.0000 |
|   10484 | 1997-03-24 00:00:00 | 1997-04-01 00:00:00 | BSBEV      |    6.8800 |
|   10778 | 1997-12-16 00:00:00 | 1997-12-24 00:00:00 | BERGS      |    6.7900 |
|   10568 | 1997-06-13 00:00:00 | 1997-07-09 00:00:00 | GALED      |    6.5400 |
|   10291 | 1996-08-27 00:00:00 | 1996-09-04 00:00:00 | QUEDE      |    6.4000 |
|   10302 | 1996-09-10 00:00:00 | 1996-10-09 00:00:00 | SUPRD      |    6.2700 |
|   11022 | 1998-04-14 00:00:00 | 1998-05-04 00:00:00 | HANAR      |    6.2700 |
|   10649 | 1997-08-28 00:00:00 | 1997-08-29 00:00:00 | MAISD      |    6.2000 |
|   11075 | 1998-05-06 00:00:00 | NULL                | RICSU      |    6.1900 |
|   10462 | 1997-03-03 00:00:00 | 1997-03-18 00:00:00 | CONSH      |    6.1700 |
|   10274 | 1996-08-06 00:00:00 | 1996-08-16 00:00:00 | VINET      |    6.0100 |
|   10297 | 1996-09-04 00:00:00 | 1996-09-10 00:00:00 | BLONP      |    5.7400 |
|   10885 | 1998-02-12 00:00:00 | 1998-02-18 00:00:00 | SUPRD      |    5.6400 |
|   10391 | 1996-12-23 00:00:00 | 1996-12-31 00:00:00 | DRACD      |    5.4500 |
|   10378 | 1996-12-10 00:00:00 | 1996-12-19 00:00:00 | FOLKO      |    5.4400 |
|   10770 | 1997-12-09 00:00:00 | 1997-12-17 00:00:00 | HANAR      |    5.3200 |
|   10489 | 1997-03-28 00:00:00 | 1997-04-09 00:00:00 | PICCO      |    5.2900 |
|   10594 | 1997-07-09 00:00:00 | 1997-07-16 00:00:00 | OLDWO      |    5.2400 |
|   10508 | 1997-04-16 00:00:00 | 1997-05-13 00:00:00 | OTTIK      |    4.9900 |
|   10886 | 1998-02-13 00:00:00 | 1998-03-02 00:00:00 | HANAR      |    4.9900 |
|   10710 | 1997-10-20 00:00:00 | 1997-10-23 00:00:00 | FRANS      |    4.9800 |
|   10959 | 1998-03-18 00:00:00 | 1998-03-23 00:00:00 | GOURL      |    4.9800 |
|   10467 | 1997-03-06 00:00:00 | 1997-03-11 00:00:00 | MAGAA      |    4.9300 |
|   10488 | 1997-03-27 00:00:00 | 1997-04-02 00:00:00 | FRANK      |    4.9300 |
|   10323 | 1996-10-07 00:00:00 | 1996-10-14 00:00:00 | KOENE      |    4.8800 |
|   10538 | 1997-05-15 00:00:00 | 1997-05-16 00:00:00 | BSBEV      |    4.8700 |
|   10809 | 1998-01-01 00:00:00 | 1998-01-07 00:00:00 | WELLI      |    4.8700 |
|   10478 | 1997-03-18 00:00:00 | 1997-03-26 00:00:00 | VICTE      |    4.8100 |
|   10704 | 1997-10-14 00:00:00 | 1997-11-07 00:00:00 | QUEEN      |    4.7800 |
|   10318 | 1996-10-01 00:00:00 | 1996-10-04 00:00:00 | ISLAT      |    4.7300 |
|   10495 | 1997-04-03 00:00:00 | 1997-04-11 00:00:00 | LAUGB      |    4.6500 |
|   11015 | 1998-04-10 00:00:00 | 1998-04-20 00:00:00 | SANTG      |    4.6200 |
|   10269 | 1996-07-31 00:00:00 | 1996-08-09 00:00:00 | WHITC      |    4.5600 |
|   10271 | 1996-08-01 00:00:00 | 1996-08-30 00:00:00 | SPLIR      |    4.5400 |
|   10793 | 1997-12-24 00:00:00 | 1998-01-08 00:00:00 | AROUT      |    4.5200 |
|   10589 | 1997-07-04 00:00:00 | 1997-07-14 00:00:00 | GREAL      |    4.4200 |
|   10476 | 1997-03-17 00:00:00 | 1997-03-24 00:00:00 | HILAA      |    4.4100 |
|   10655 | 1997-09-03 00:00:00 | 1997-09-11 00:00:00 | REGGC      |    4.4100 |
|   10683 | 1997-09-26 00:00:00 | 1997-10-01 00:00:00 | DUMON      |    4.4000 |
|   10432 | 1997-01-31 00:00:00 | 1997-02-07 00:00:00 | SPLIR      |    4.3400 |
|   10810 | 1998-01-01 00:00:00 | 1998-01-07 00:00:00 | LAUGB      |    4.3300 |
|   10550 | 1997-05-28 00:00:00 | 1997-06-06 00:00:00 | GODOS      |    4.3200 |
|   10992 | 1998-04-01 00:00:00 | 1998-04-03 00:00:00 | THEBI      |    4.2700 |
|   10472 | 1997-03-12 00:00:00 | 1997-03-19 00:00:00 | SEVES      |    4.2000 |
|   11057 | 1998-04-29 00:00:00 | 1998-05-01 00:00:00 | NORTS      |    4.1300 |
|   10439 | 1997-02-07 00:00:00 | 1997-02-10 00:00:00 | MEREP      |    4.0700 |
|   10677 | 1997-09-22 00:00:00 | 1997-09-26 00:00:00 | ANTON      |    4.0300 |
|   10374 | 1996-12-05 00:00:00 | 1996-12-09 00:00:00 | WOLZA      |    3.9400 |
|   10412 | 1997-01-13 00:00:00 | 1997-01-15 00:00:00 | WARTH      |    3.7700 |
|   10264 | 1996-07-24 00:00:00 | 1996-08-23 00:00:00 | FOLKO      |    3.6700 |
|   10512 | 1997-04-21 00:00:00 | 1997-04-24 00:00:00 | FAMIA      |    3.5300 |
|   10705 | 1997-10-15 00:00:00 | 1997-11-18 00:00:00 | HILAA      |    3.5200 |
|   10745 | 1997-11-18 00:00:00 | 1997-11-27 00:00:00 | QUICK      |    3.5200 |
|   10915 | 1998-02-27 00:00:00 | 1998-03-02 00:00:00 | TORTU      |    3.5100 |
|   10444 | 1997-02-12 00:00:00 | 1997-02-21 00:00:00 | BERGS      |    3.5000 |
|   10321 | 1996-10-03 00:00:00 | 1996-10-11 00:00:00 | ISLAT      |    3.4300 |
|   10528 | 1997-05-06 00:00:00 | 1997-05-09 00:00:00 | GREAL      |    3.3500 |
|   10947 | 1998-03-13 00:00:00 | 1998-03-16 00:00:00 | BSBEV      |    3.2600 |
|   10955 | 1998-03-17 00:00:00 | 1998-03-20 00:00:00 | FOLKO      |    3.2600 |
|   10259 | 1996-07-18 00:00:00 | 1996-07-25 00:00:00 | CENTC      |    3.2500 |
|   11037 | 1998-04-21 00:00:00 | 1998-04-27 00:00:00 | GODOS      |    3.2000 |
|   11019 | 1998-04-13 00:00:00 | NULL                | RANCH      |    3.1700 |
|   10347 | 1996-11-06 00:00:00 | 1996-11-08 00:00:00 | FAMIA      |    3.1000 |
|   10261 | 1996-07-19 00:00:00 | 1996-07-30 00:00:00 | QUEDE      |    3.0500 |
|   10864 | 1998-02-02 00:00:00 | 1998-02-09 00:00:00 | AROUT      |    3.0400 |
|   10422 | 1997-01-22 00:00:00 | 1997-01-31 00:00:00 | FRANS      |    3.0200 |
|   10581 | 1997-06-26 00:00:00 | 1997-07-02 00:00:00 | FAMIA      |    3.0100 |
|   10777 | 1997-12-15 00:00:00 | 1998-01-21 00:00:00 | GOURL      |    3.0100 |
|   10708 | 1997-10-17 00:00:00 | 1997-11-05 00:00:00 | THEBI      |    2.9600 |
|   10281 | 1996-08-14 00:00:00 | 1996-08-21 00:00:00 | ROMEY      |    2.9400 |
|   10602 | 1997-07-17 00:00:00 | 1997-07-22 00:00:00 | VAFFE      |    2.9200 |
|   10738 | 1997-11-12 00:00:00 | 1997-11-18 00:00:00 | SPECD      |    2.9100 |
|   10881 | 1998-02-11 00:00:00 | 1998-02-18 00:00:00 | CACTU      |    2.8400 |
|   11051 | 1998-04-27 00:00:00 | NULL                | LAMAI      |    2.7900 |
|   10454 | 1997-02-21 00:00:00 | 1997-02-25 00:00:00 | LAMAI      |    2.7400 |
|   10840 | 1998-01-19 00:00:00 | 1998-02-16 00:00:00 | LINOD      |    2.7100 |
|   10963 | 1998-03-19 00:00:00 | 1998-03-26 00:00:00 | FURIB      |    2.7000 |
|   10950 | 1998-03-16 00:00:00 | 1998-03-23 00:00:00 | MAGAA      |    2.5000 |
|   10410 | 1997-01-10 00:00:00 | 1997-01-15 00:00:00 | BOTTM      |    2.4000 |
|   10754 | 1997-11-25 00:00:00 | 1997-11-27 00:00:00 | MAGAA      |    2.3800 |
|   10798 | 1997-12-26 00:00:00 | 1998-01-05 00:00:00 | ISLAT      |    2.3300 |
|   10925 | 1998-03-04 00:00:00 | 1998-03-13 00:00:00 | HANAR      |    2.2700 |
|   10943 | 1998-03-11 00:00:00 | 1998-03-19 00:00:00 | BSBEV      |    2.1700 |
|   10960 | 1998-03-19 00:00:00 | 1998-04-08 00:00:00 | HILAA      |    2.0800 |
|   10676 | 1997-09-22 00:00:00 | 1997-09-29 00:00:00 | TORTU      |    2.0100 |
|   10313 | 1996-09-24 00:00:00 | 1996-10-04 00:00:00 | QUICK      |    1.9600 |
|   10614 | 1997-07-29 00:00:00 | 1997-08-01 00:00:00 | BLAUS      |    1.9300 |
|   10867 | 1998-02-03 00:00:00 | 1998-02-11 00:00:00 | LONEP      |    1.9300 |
|   10609 | 1997-07-24 00:00:00 | 1997-07-30 00:00:00 | DUMON      |    1.8500 |
|   10900 | 1998-02-20 00:00:00 | 1998-03-04 00:00:00 | WELLI      |    1.6600 |
|   10734 | 1997-11-07 00:00:00 | 1997-11-12 00:00:00 | GOURL      |    1.6300 |
|   10308 | 1996-09-18 00:00:00 | 1996-09-24 00:00:00 | ANATR      |    1.6100 |
|   10767 | 1997-12-05 00:00:00 | 1997-12-15 00:00:00 | SUPRD      |    1.5900 |
|   10785 | 1997-12-18 00:00:00 | 1997-12-24 00:00:00 | GROSR      |    1.5100 |
|   10548 | 1997-05-26 00:00:00 | 1997-06-02 00:00:00 | TOMSP      |    1.4300 |
|   10752 | 1997-11-24 00:00:00 | 1997-11-28 00:00:00 | NORTS      |    1.3900 |
|   10807 | 1997-12-31 00:00:00 | 1998-01-30 00:00:00 | FRANS      |    1.3600 |
|   10928 | 1998-03-05 00:00:00 | 1998-03-18 00:00:00 | GALED      |    1.3600 |
|   10292 | 1996-08-28 00:00:00 | 1996-09-02 00:00:00 | TRADH      |    1.3500 |
|   10480 | 1997-03-20 00:00:00 | 1997-03-24 00:00:00 | FOLIG      |    1.3500 |
|   10352 | 1996-11-12 00:00:00 | 1996-11-18 00:00:00 | FURIB      |    1.3000 |
|   10662 | 1997-09-09 00:00:00 | 1997-09-18 00:00:00 | LONEP      |    1.2800 |
|   10664 | 1997-09-10 00:00:00 | 1997-09-19 00:00:00 | FURIB      |    1.2700 |
|   10898 | 1998-02-20 00:00:00 | 1998-03-06 00:00:00 | OCEAN      |    1.2700 |
|   10980 | 1998-03-27 00:00:00 | 1998-04-17 00:00:00 | FOLKO      |    1.2600 |
|   10887 | 1998-02-13 00:00:00 | 1998-02-16 00:00:00 | GALED      |    1.2500 |
|   10824 | 1998-01-09 00:00:00 | 1998-01-30 00:00:00 | FOLKO      |    1.2300 |
|   10899 | 1998-02-20 00:00:00 | 1998-02-26 00:00:00 | LILAS      |    1.2100 |
|   11011 | 1998-04-09 00:00:00 | 1998-04-13 00:00:00 | ALFKI      |    1.2100 |
|   10370 | 1996-12-03 00:00:00 | 1996-12-27 00:00:00 | CHOPS      |    1.1700 |
|   10295 | 1996-09-02 00:00:00 | 1996-09-10 00:00:00 | VINET      |    1.1500 |
|   10636 | 1997-08-19 00:00:00 | 1997-08-26 00:00:00 | WARTH      |    1.1500 |
|   10996 | 1998-04-02 00:00:00 | 1998-04-10 00:00:00 | QUICK      |    1.1200 |
|   10782 | 1997-12-17 00:00:00 | 1997-12-22 00:00:00 | CACTU      |    1.1000 |
|   10620 | 1997-08-05 00:00:00 | 1997-08-14 00:00:00 | LAUGB      |    0.9400 |
|   11071 | 1998-05-05 00:00:00 | NULL                | LILAS      |    0.9300 |
|   10674 | 1997-09-18 00:00:00 | 1997-09-30 00:00:00 | ISLAT      |    0.9000 |
|   10631 | 1997-08-14 00:00:00 | 1997-08-15 00:00:00 | LAMAI      |    0.8700 |
|   10873 | 1998-02-06 00:00:00 | 1998-02-09 00:00:00 | WILMK      |    0.8200 |
|   10348 | 1996-11-07 00:00:00 | 1996-11-15 00:00:00 | WANDK      |    0.7800 |
|   10615 | 1997-07-30 00:00:00 | 1997-08-06 00:00:00 | WILMK      |    0.7500 |
|   11005 | 1998-04-07 00:00:00 | 1998-04-10 00:00:00 | WILMK      |    0.7500 |
|   10333 | 1996-10-18 00:00:00 | 1996-10-25 00:00:00 | WARTH      |    0.5900 |
|   10699 | 1997-10-09 00:00:00 | 1997-10-13 00:00:00 | MORGK      |    0.5800 |
|   10307 | 1996-09-17 00:00:00 | 1996-09-25 00:00:00 | LONEP      |    0.5600 |
|   10849 | 1998-01-23 00:00:00 | 1998-01-30 00:00:00 | KOENE      |    0.5600 |
|   10883 | 1998-02-12 00:00:00 | 1998-02-20 00:00:00 | LONEP      |    0.5300 |
|   10586 | 1997-07-02 00:00:00 | 1997-07-09 00:00:00 | REGGC      |    0.4800 |
|   10371 | 1996-12-03 00:00:00 | 1996-12-24 00:00:00 | LAMAI      |    0.4500 |
|   10322 | 1996-10-04 00:00:00 | 1996-10-23 00:00:00 | PERIC      |    0.4000 |
|   11054 | 1998-04-28 00:00:00 | NULL                | CACTU      |    0.3300 |
|   10969 | 1998-03-23 00:00:00 | 1998-03-30 00:00:00 | COMMI      |    0.2100 |
|   10415 | 1997-01-15 00:00:00 | 1997-01-24 00:00:00 | HUNGC      |    0.2000 |
|   11035 | 1998-04-20 00:00:00 | 1998-04-24 00:00:00 | SUPRD      |    0.1700 |
|   10509 | 1997-04-17 00:00:00 | 1997-04-29 00:00:00 | BLAUS      |    0.1500 |
|   10644 | 1997-08-25 00:00:00 | 1997-09-01 00:00:00 | WELLI      |    0.1400 |
|   10296 | 1996-09-03 00:00:00 | 1996-09-11 00:00:00 | LILAS      |    0.1200 |
|   10972 | 1998-03-24 00:00:00 | 1998-03-26 00:00:00 | LACOR      |    0.0200 |
+---------+---------------------+---------------------+------------+-----------+
830 rows in set (0.07 sec)












14. Write a query to get CompanyName, Fax, Phone, HomePage and Country from the Suppliers table sorted by Country in descending order and then by CompanyName in ascending order.



D3_56588>SELECT CompanyName, Fax, Phone, HomePage, Country FROM suppliers ORDER BY Country DESC, CompanyName;
+----------------------------------------+-----------------+-----------------+------------------------------------------------------------------------------------------------+-------------+
| CompanyName                            | Fax             | Phone           | HomePage                                                                                       | Country     |
+----------------------------------------+-----------------+-----------------+------------------------------------------------------------------------------------------------+-------------+
| Bigfoot Breweries                      | NULL            | (503) 555-9931  | NULL                                                                                           | USA         |
| Grandma Kelly's Homestead              | (313) 555-3349  | (313) 555-5735  | NULL                                                                                           | USA         |
| New England Seafood Cannery            | (617) 555-3389  | (617) 555-3267  | NULL                                                                                           | USA         |
| New Orleans Cajun Delights             | NULL            | (100) 555-4822  | #CAJUN.HTM#                                                                                    | USA         |
| Exotic Liquids                         | NULL            | (171) 555-2222  | NULL                                                                                           | UK          |
| Specialty Biscuits, Ltd.               | NULL            | (161) 555-4448  | NULL                                                                                           | UK          |
| PB Knckebrd AB                         | 031-987 65 91   | 031-987 65 43   | NULL                                                                                           | Sweden      |
| Svensk Sjfda AB                        | NULL            | 08-123 45 67    | NULL                                                                                           | Sweden      |
| Cooperativa de Quesos 'Las Cabras'     | NULL            | (98) 598 76 54  | NULL                                                                                           | Spain       |
| Leka Trading                           | NULL            | 555-8787        | NULL                                                                                           | Singapore   |
| Norske Meierier                        | NULL            | (0)2-953010     | NULL                                                                                           | Norway      |
| Zaanse Snoepfabriek                    | (12345) 1210    | (12345) 1212    | NULL                                                                                           | Netherlands |
| Mayumi's                               | NULL            | (06) 431-7877   | Mayumi's (on the World Wide Web)#http://www.microsoft.com/accessdev/sampleapps/mayumi.htm#     | Japan       |
| Tokyo Traders                          | NULL            | (03) 3555-5011  | NULL                                                                                           | Japan       |
| Formaggi Fortini s.r.l.                | (0544) 60603    | (0544) 60323    | #FORMAGGI.HTM#                                                                                 | Italy       |
| Pasta Buttini s.r.l.                   | (089) 6547667   | (089) 6547665   | NULL                                                                                           | Italy       |
| Heli Swaren GmbH & Co. KG              | NULL            | (010) 9984510   | NULL                                                                                           | Germany     |
| Nord-Ost-Fisch Handelsgesellschaft mbH | (04721) 8714    | (04721) 8713    | NULL                                                                                           | Germany     |
| Plutzer Lebensmittelgromrkte AG        | NULL            | (069) 992755    | Plutzer (on the World Wide Web)#http://www.microsoft.com/accessdev/sampleapps/plutzer.htm#     | Germany     |
| Aux joyeux ecclsiastiques              | (1) 03.83.00.62 | (1) 03.83.00.68 | NULL                                                                                           | France      |
| Escargots Nouveaux                     | NULL            | 85.57.00.07     | NULL                                                                                           | France      |
| Gai pturage                            | 38.76.98.58     | 38.76.98.06     | NULL                                                                                           | France      |
| Karkki Oy                              | NULL            | (953) 10956     | NULL                                                                                           | Finland     |
| Lyngbysild                             | 43844115        | 43844108        | NULL                                                                                           | Denmark     |
| Forts d'rables                         | (514) 555-2921  | (514) 555-2955  | NULL                                                                                           | Canada      |
| Ma Maison                              | NULL            | (514) 555-9022  | NULL                                                                                           | Canada      |
| Refrescos Americanas LTDA              | NULL            | (11) 555 4640   | NULL                                                                                           | Brazil      |
| G'day, Mate                            | (02) 555-4873   | (02) 555-5914   | G'day Mate (on the World Wide Web)#http://www.microsoft.com/accessdev/sampleapps/gdaymate.htm# | Australia   |
| Pavlova, Ltd.                          | (03) 444-6588   | (03) 444-2343   | NULL                                                                                           | Australia   |
+----------------------------------------+-----------------+-----------------+------------------------------------------------------------------------------------------------+-------------+
29 rows in set (0.00 sec)









15. Create a list of employees showing title, first name, and last name. Sort by Title in ascending order and then by LastName in descending order.

D3_56588>SELECT Title, FirstName, LastName FROM employees ORDER BY Title, LastName DESC;
+--------------------------+-----------+-----------+
| Title                    | FirstName | LastName  |
+--------------------------+-----------+-----------+
| Inside Sales Coordinator | Laura     | Callahan  |
| Sales Manager            | Steven    | Buchanan  |
| Sales Representative     | Michael   | Suyama    |
| Sales Representative     | Margaret  | Peacock   |
| Sales Representative     | Janet     | Leverling |
| Sales Representative     | Robert    | King      |
| Sales Representative     | Anne      | Dodsworth |
| Sales Representative     | Nancy     | Davolio   |
| Vice President, Sales    | Andrew    | Fuller    |
+--------------------------+-----------+-----------+
9 rows in set (0.00 sec)










16. Create a report showing all the company names and contact names of Northwind's customers in Buenos Aires.

D3_56588>SELECT CompanyName, ContactName FROM customers WHERE City = 'Buenos Aires';
+----------------------------+------------------+
| CompanyName                | ContactName      |
+----------------------------+------------------+
| Cactus Comidas para llevar | Patricio Simpson |
| Ocano Atlntico Ltda.       | Yvonne Moncada   |
| Rancho grande              | Sergio Gutirrez  |
+----------------------------+------------------+
3 rows in set (0.10 sec)










17. Create a report showing the product name, unit price and quantity per unit of all products that are out of stock.

D3_56588>SELECT ProductName, UnitPrice, QuantityPerUnit FROM products WHERE UnitsInStock = 0;
+------------------------+-----------+----------------------+
| ProductName            | UnitPrice | QuantityPerUnit      |
+------------------------+-----------+----------------------+
| Chef Anton's Gumbo Mix |   21.3500 | 36 boxes             |
| Alice Mutton           |   39.0000 | 20 - 1 kg tins       |
| Thringer Rostbratwurst |  123.7900 | 50 bags x 30 sausgs. |
| Gorgonzola Telino      |   12.5000 | 12 - 100 g pkgs      |
| Perth Pasties          |   32.8000 | 48 pieces            |
+------------------------+-----------+----------------------+
5 rows in set (0.00 sec)










18. Create a report showing the order date, shipped date, customer id, and freight of all orders placed on May 19, 1997.

D3_56588>SELECT OrderDate, ShippedDate, CustomerId, Freight FROM orders WHERE OrderDate = '1997-05-19';
+---------------------+---------------------+------------+-----------+
| OrderDate           | ShippedDate         | CustomerId | Freight   |
+---------------------+---------------------+------------+-----------+
| 1997-05-19 00:00:00 | 1997-06-13 00:00:00 | QUICK      | 1007.6400 |
| 1997-05-19 00:00:00 | 1997-05-29 00:00:00 | HANAR      |   68.6500 |
+---------------------+---------------------+------------+-----------+
2 rows in set (0.00 sec)









19. Create a report that shows the company name, contact name and fax number of all customers that have a fax number.

D3_56588>SELECT CompanyName, ContactName, Fax FROM customers WHERE FAX is not NULL;
+--------------------------------------+-------------------------+-------------------+
| CompanyName                          | ContactName             | Fax               |
+--------------------------------------+-------------------------+-------------------+
| Alfreds Futterkiste                  | Maria Anders            | 030-0076545       |
| Ana Trujillo Emparedados y helados   | Ana Trujillo            | (5) 555-3745      |
| Around the Horn                      | Thomas Hardy            | (171) 555-6750    |
| Berglunds snabbkp                    | Christina Berglund      | 0921-12 34 67     |
| Blauer See Delikatessen              | Hanna Moos              | 0621-08924        |
| Blondesddsl pre et fils              | Frdrique Citeaux        | 88.60.15.32       |
| Blido Comidas preparadas             | Martn Sommer            | (91) 555 91 99    |
| Bon app'                             | Laurence Lebihan        | 91.24.45.41       |
| Bottom-Dollar Markets                | Elizabeth Lincoln       | (604) 555-3745    |
| Cactus Comidas para llevar           | Patricio Simpson        | (1) 135-4892      |
| Centro comercial Moctezuma           | Francisco Chang         | (5) 555-7293      |
| Consolidated Holdings                | Elizabeth Brown         | (171) 555-9199    |
| Drachenblut Delikatessen             | Sven Ottlieb            | 0241-059428       |
| Du monde entier                      | Janine Labrune          | 40.67.89.89       |
| Eastern Connection                   | Ann Devon               | (171) 555-3373    |
| Ernst Handel                         | Roland Mendel           | 7675-3426         |
| FISSA Fabrica Inter. Salchichas S.A. | Diego Roel              | (91) 555 55 93    |
| Folies gourmandes                    | Martine Ranc            | 20.16.10.17       |
| Frankenversand                       | Peter Franken           | 089-0877451       |
| France restauration                  | Carine Schmitt          | 40.32.21.20       |
| Franchi S.p.A.                       | Paolo Accorti           | 011-4988261       |
| Furia Bacalhau e Frutos do Mar       | Lino Rodriguez          | (1) 354-2535      |
| Galera del gastrnomo                 | Eduardo Saavedra        | (93) 203 4561     |
| GROSELLA-Restaurante                 | Manuel Pereira          | (2) 283-3397      |
| Hanari Carnes                        | Mario Pontes            | (21) 555-8765     |
| HILARION-Abastos                     | Carlos Hernndez         | (5) 555-1948      |
| Hungry Coyote Import Store           | Yoshi Latimer           | (503) 555-2376    |
| Hungry Owl All-Night Grocers         | Patricia McKenna        | 2967 3333         |
| La corne d'abondance                 | Daniel Tonini           | 30.59.85.11       |
| La maison d'Asie                     | Annette Roulet          | 61.77.61.11       |
| Laughing Bacchus Wine Cellars        | Yoshi Tannamuri         | (604) 555-7293    |
| Lazy K Kountry Store                 | John Steel              | (509) 555-6221    |
| Lehmanns Marktstand                  | Renate Messner          | 069-0245874       |
| LILA-Supermercado                    | Carlos Gonzlez          | (9) 331-7256      |
| LINO-Delicateses                     | Felipe Izquierdo        | (8) 34-93-93      |
| Lonesome Pine Restaurant             | Fran Wilson             | (503) 555-9646    |
| Magazzini Alimentari Riuniti         | Giovanni Rovelli        | 035-640231        |
| Maison Dewey                         | Catherine Dewey         | (02) 201 24 68    |
| Mre Paillarde                        | Jean Fresnire           | (514) 555-8055    |
| North/South                          | Simon Crowther          | (171) 555-2530    |
| Ocano Atlntico Ltda.                 | Yvonne Moncada          | (1) 135-5535      |
| Old World Delicatessen               | Rene Phillips           | (907) 555-2880    |
| Ottilies Kseladen                    | Henriette Pfalzheim     | 0221-0765721      |
| Paris spcialits                      | Marie Bertrand          | (1) 42.34.22.77   |
| Pericles Comidas clsicas             | Guillermo Fernndez      | (5) 545-3745      |
| Piccolo und mehr                     | Georg Pipps             | 6562-9723         |
| Que Delcia                           | Bernardo Batista        | (21) 555-4545     |
| Rancho grande                        | Sergio Gutirrez         | (1) 123-5556      |
| Rattlesnake Canyon Grocery           | Paula Wilson            | (505) 555-3620    |
| Reggiani Caseifici                   | Maurizio Moroni         | 0522-556722       |
| Romero y tomillo                     | Alejandra Camino        | (91) 745 6210     |
| Sant Gourmet                         | Jonas Bergulfsen        | 07-98 92 47       |
| Seven Seas Imports                   | Hari Kumar              | (171) 555-5646    |
| Simons bistro                        | Jytte Petersen          | 31 13 35 57       |
| Spcialits du monde                   | Dominique Perrier       | (1) 47.55.60.20   |
| Split Rail Beer & Ale                | Art Braunschweiger      | (307) 555-6525    |
| Suprmes dlices                       | Pascale Cartrain        | (071) 23 67 22 21 |
| The Cracker Box                      | Liu Wong                | (406) 555-8083    |
| Toms Spezialitten                    | Karin Josephs           | 0251-035695       |
| Tradio Hipermercados                 | Anabela Domingues       | (11) 555-2168     |
| Trail's Head Gourmet Provisioners    | Helvetius Nagy          | (206) 555-2174    |
| Vaffeljernet                         | Palle Ibsen             | 86 22 33 44       |
| Victuailles en stock                 | Mary Saveley            | 78.32.54.87       |
| Vins et alcools Chevalier            | Paul Henriot            | 26.47.15.11       |
| Die Wandernde Kuh                    | Rita Mller              | 0711-035428       |
| Wartian Herkku                       | Pirkko Koskitalo        | 981-443655        |
| White Clover Markets                 | Karl Jablonski          | (206) 555-4115    |
| Wilman Kala                          | Matti Karttunen         | 90-224 8858       |
| Wolski  Zajazd                       | Zbyszek Piestrzeniewicz | (26) 642-7012     |
+--------------------------------------+-------------------------+-------------------+
69 rows in set (0.00 sec)













20. Create a report that shows the first and last name of all employees who do not report to anybody.

D3_56588>SELECT FirstName,LastName FROM employees WHERE ReportsTo IS NOT NULL;
+-----------+-----------+
| FirstName | LastName  |
+-----------+-----------+
| Nancy     | Davolio   |
| Janet     | Leverling |
| Margaret  | Peacock   |
| Steven    | Buchanan  |
| Laura     | Callahan  |
| Michael   | Suyama    |
| Robert    | King      |
| Anne      | Dodsworth |
+-----------+-----------+
8 rows in set (0.00 sec)


