- create a dir by the name one in a cur dir and change dir to one
$mkdir one
$ cd one


- create 3 text files inside dir one
$touch 1.txt 11.txt 111.txt

- create dir by the name two inside one and go inside it
$mkdir two
$cd two


- create 3 text files inside dir two
$touch 2.txt 22.txt 222.txt


- create dir by the name three inside two and go inside it
$mkdir three
$cd three


- create 3 text files inside dir three
$touch 3.txt 33.txt 333.txt


- create dir by the name four inside three and go inside it
$mkdir four
$cd four


- create 3 text files inside dir four
$touch 4.txt 44.txt 444.txt


- create dir by the name five inside four and go inside it
$mkdir five
$cd five


- create 3 text files inside dir five
$touch 5.txt 55.txt 555.txt


- goto home directory:
$cd ~ OR $cd /home/sunbeam




After creating above directory structure do following operations:
1. list directory contents of the dir five from cur directory (i.e. from home dir)
-> ls os/linux_commands/one/two/three/four/five

2. write your name in a file named 444.txt of dir four from current dir.
-> cat >> os/linux_commands/one/two/three/four/444.txt

3. remove the file named 555.txt from current directory.
->rm os/linux_commands/one/two/three/four/five/555.txt

4. change directory to five, use relative path to go dir five
-> cd os/linux_commands/one/two/three/four/five

5. write your course name in file named 333.txt which resides in dir three from cur directory (i.e. from five).
-> cat >> ../../333.txt

6. list the contents of dir two from the cur directory (i.e. from five)
-> ls ../../../

7. remove file named 222.txt which belongs to dir two from cur dir.
-> rm ../../../222.txt

8. change directory to one
-> cd ../../../../

9. remove all the files only from dir named five from current directory (i.e. from one).
-> rm two/three/four/five/*

10. remove directory named five from the current directory (i.e. from one).
-> rm -r two/three/four/five

11. remove whole directory four from current directory (i.e. from one).
-> rm -r two/three/four

12. change directory to home directory
-> cd ~

13. change the time stamps of the file named 333.txt which resides in a directory by
the name three from the current directory.
-> touch -a os/linux_commands/one/two/three/333.txt

14. add contents into the file 11.txt by using cat command, and display again from
current directory (i.e. from home directory).
-> cat >> os/linux_commands/one/11.txt

15. append contenst inside the same file again from the same location.
-> cat >> os/linux_commands/one/11.txt

16. goto dir one, create a file by the name .india.txt and append data into it.
After creating file give $ls command & $ls -a command and check the difference.
-> cd os/linux_commands/one
     touch .india.txt
     ls
     ls -a




