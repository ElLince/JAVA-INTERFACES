interface Cola {

    void encolar (String nuevo);
    String desencolar();

   /*  default void encolarMultiple(Integer nuevo, int repeticiones){
        for (int i=0; i<repeticiones; i++){
            encolar(nuevo);
        }
    }*/
}
