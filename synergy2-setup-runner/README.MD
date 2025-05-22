# Synergy setup installer

## L'installatore di synergy

[![N|Solid](https://www.sanmarcoinformatica.com/wp-content/themes/smi/img/logo-SMI.svg)](https://www.sanmarcoinformatica.com/)

## Avvio installazione

- Apri un terminale con permessi di amministratore nella cartella di installazione e lancia il seguente comando per far partire l'installazione:
    - se windows  ` ./run.bat`
    - se linux/mac-os `sudo sh ./run.sh`

## Avvio in modalità bot

### Prima installazione

##### DATABASE:

```shell
java -jar version.jar -cp ./lib/* -config ../NOME_FILE.yml -firstInstallation true -dataInstallation false -destroyAll true -preserveContext true
```

#### DATI

```shell
java -jar version.jar -cp ./lib/* -config ../NOME_FILE.yml -baseInstallation false  -demoInstallation true -firstInstallation true
```

### Aggiornamento

##### DATABASE

```shell
java -jar version.jar -cp ./lib/* -config ../NOME_FILE.yml -dataInstallation false
```

##### DATI:

```shell
java -jar version.jar -cp ./lib/* -config ../NOME_FILE.yml -baseInstallation false  -demoInstallation true
```

- Cosa fa il programma di installazione?,
    - se prima installazione:
        - genera le tabelle in database;
        - copia le cartelle synergy2-ws e synergy nelle `TOMCAT_FOLDER/webapps`;
        - crea `TOMCAT_FOLDER/webapps/synergy2-ws/WEB-INF/classes/application.yml` con la configurazione imposata durante l'installazione;
        - crea `TOMCAT_FOLDER/webapps/synergy-config/synergy-std/base.json` con alcune configurazioni usate dall'app client synergy;
        - copia eventuali webapps dalle cartelle `apps/CODICE_APP/**` (se presenti);
        - lancia l'installazione dei dati di sistema;
    - se in aggiornamento
        - aggiorna il database;
        - copia le cartelle synergy2-ws e synergy nelle webapps;
        - copia eventuali webapps dalle cartelle `apps/CODICE_APP/**` (se presenti);
        - lancia l'installazione dei dati di sistema
