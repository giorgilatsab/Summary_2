package com.giorgi.summary_2

class Anarams {

    fun anagramsPairs(arr: Array < String > , n: Int): Unit
    {
        if (n <= 0)
        {
            return;
        }
        val record: Array < String > = Array(n)
        {
            ""
        };
        var auxiliary: String ;
        var i: Int = 0;
        // Sort array string and put into record
        while (i < n)
        {
            var word = arr[i].toCharArray();
            // Get sorted word
            auxiliary = word.sorted().joinToString("");
            record[i] = auxiliary;
            i += 1;
        }
        i = 0;
        // Display relative pairs of anagrams
        while (i < n)
        {
            var j: Int = i + 1;
            while (j < n)
            {
                if (record[i].equals(record[j]))
                {
                    print("(" + arr[i] + "," + arr[j] + ")\n");
                }
                j += 1;
            }
            i += 1;
        }
    }
}
