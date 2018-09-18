---
description: v1.0.0
---

# Proje Yönetimi Dökümantasyonu

Projenin başlangıç hali

```text
 public DoktorİlacGir() {
        initComponents();
        jTextField1.setText(String.valueOf(DoktorGirisEkrani.rID));
        ilacID();
    }
    
    void ilacID() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("YazilimMuhPU");
        EntityManager em = emf.createEntityManager();
        Query q = em.createQuery("SELECT MAX(p.ilacid) FROM Ilac p");
        
        int d = (int) q.getResultList().get(0);
        jTextField5.setText(String.valueOf(d + 1));
        
        em.close();
        emf.close();
        
    }
```

