int beer = 99;
for (int i = 0; i < 100; i++) {
  if(beer > 1){
    println((beer-1) + " bottles of beer on the wall, " + (beer-1) + " bottles of beer.\n"+
"Take one down and pass it around, " + (beer - 2) + " bottles of beer on the wall.");
beer = beer - 1;
  }
  else if(beer == 2){
    println(beer + " bottles of beer on the wall, " + (beer-1) + " bottles of beer.\n"+
"Take one down and pass it around, no more bottles of beer on the wall.");
  }
  else if(beer == 1){
    println("No more bottles of beer on the wall, no more bottles of beer.\n Go to the store and buy some more, 99 bottles of beer on the wall.");
  }
}
