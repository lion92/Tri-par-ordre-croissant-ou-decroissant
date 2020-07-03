package training;

public class Tri_rapide {
	 static  int [] table  =  new  int [21]  ;  // le tableau à trier en attribut
	 /*  Les cellules [0] et [20] contiennent 
	     des sentinelles,
	     Les cellules utiles vont de 1 è 19.
	     (de 1 à table.length-2)
	 */
	 
	  static void  impression  ( ) 
	 {
	   // Affichage sans les sentinelles
	   int  n  =  table.length - 2 ;
	  for (  int  i  =  1 ;  i <= n ;  i ++ ) 
	    System.out.print ( table[i] + " , ");
	   System.out.println ();
	 }
	 
	 static void  initialisation   ( ) 
	 {
	   // remplissage aléatoire du tableau 
	   int  n  =  table.length - 2 ;
	  for( int  i  =  1 ;  i <= n ;  i ++ )  
	    table[i]  =  ( int )( Math.random () * 100 );
	   // Les sentinelles:
	   table[0]  = - Integer.MAX_VALUE ;
	   table[n + 1]  =  Integer.MAX_VALUE ;
	 }
	 
	  // ----> Tri rapide :
	 
	  static  int  partition  ( int  G,  int  D  )
	 {  // partition / Sedgewick /
	   int  i, j, piv, temp ;
	   piv  =  table[D] ;
	   i  =  G - 1 ;
	   j  =  D ;
	  do
	   {
	    do
	      i ++ ;  
	    while ( table[i] < piv );
	    do
	      j -- ;  
	    while ( table[j] > piv );
	     temp  =  table[i] ;
	     table[i]  =  table[j] ;
	     table[j]  =  temp ;
	   }
	  while( j > i );
	   table[j]  =  table[i] ;
	   table[i]  =  table[D] ;
	   table[D]  =  temp ;
	  return  i ;
	 }
	 
	 
	 
	 static void  QSort  ( int  G,  int  D  )
	 {  // tri rapide, sous-programme récursif
	   int  i ;
	  if( D > G )
	  {
	    i  =  partition ( G,D );
	    QSort ( G,i - 1 );
	    QSort ( i + 1,D );
	  }
	 }
	 
	 public static void  main ( String[ ] args ) 
	 {
	   initialisation  ( );
	   int  n  =  table.length - 2 ;
	   System.out.println ("Tableau initial :");
	   impression  ( );
	   QSort ( 1,n );
	   System.out.println ("Tableau une fois trié :");
	   impression  ( );
	 }  
}
