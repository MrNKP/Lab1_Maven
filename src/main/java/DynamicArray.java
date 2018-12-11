public class DynamicArray {
    private int mas[];

    private int kol;

    public DynamicArray()
    {
        mas = null;
        kol = 0;
    }

    public int getKol()
    {
        return kol;
    }

    public int getElem(int ind)
    {
        if (kol != 0 && ind >= 0 && ind < kol) return mas[ind];
        return 0;
    }

    public void add(int elem)
    {
        if (kol == 0)
        {
            mas = new int[1];
            mas[0] = elem;
        }
        else
        {
            int tmas[] = new int[kol + 1];
            for(int i = 0; i < kol; i++) tmas[i] = mas[i];
            tmas[kol] = elem;
            mas = tmas;
        }
        kol++;
    }

    public boolean delete(int ind)
    {
        if (kol != 0 && ind >= 0 && ind < kol)
        {
            int tmas[] = new int[kol - 1];
            for(int i = 0; i < ind; i++) tmas[i] = mas[i];
            for(int i = ind + 1; i < kol; i++) tmas[i - 1] = mas[i];
            mas = tmas;
            kol--;
            return true;
        }
        return false;
    }

    public boolean change(int ind, int elem)
    {
        if (kol != 0 && ind >= 0 && ind < kol)
        {
            mas[ind] = elem;
            return true;
        }
        return false;
    }

    public void info()
    {
        System.out.print("Элементы массива :");
        if (kol != 0)
        {
            for(int i = 0; i < kol; i++) System.out.print("\t" + mas[i]);
            System.out.println();
        }
        else System.out.println(" - ");
        System.out.println("Число элементов массива : " + kol);
        System.out.println();
    }
}
