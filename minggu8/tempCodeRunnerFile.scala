

    for (i <- 1 to jumlahBilangan) {
      val bilangan = scala.io.StdIn.readInt()

      // Jika ini adalah bilangan pertama, inisialisasi nilai terkecil dan terbesar
      if (firstNumber) {
        nilaiTerkecil = bilangan
        nilaiTerbesar = bilangan
        firstNumber = false
      } else {
        // Memperbarui nilai terkecil dan terbesar
        if (bilangan < nilaiTerkecil) nilaiTerkecil = bilangan
        if (bilangan > nilaiTerbesar) nilaiTerbesar = bilangan
      }

      // Menghitung jumlah bilangan ganjil
      if (bilangan % 2 != 0) jumlahGanjil += bilangan
    }