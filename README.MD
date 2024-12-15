# Compte Rendu : Développement d'un Web Service SOAP

## Description

Ce projet consiste en la création d'un Web Service SOAP permettant de :
- Convertir un montant de l'Euro en Dirhams (DH).
- Consulter les détails d'un compte bancaire.
- Consulter une liste de comptes bancaires.

---

## Architecture

### Classe `Compte`
<img src="captures/1- Class Compte.png" alt="Diagramme de la classe Compte">

### Service bancaire
<img src="captures/2- Banque Service.png" alt="Diagramme du service bancaire">

### Déploiement du Web Service
Le Web Service est déployé à l'aide d'un serveur JaxWS simple.
<img src="captures/3- Server JaxWS.png" alt="Serveur JaxWS">

---

## Analyse et Test

### Analyse du WSDL
Le fichier WSDL du Web Service est accessible via un navigateur HTTP.
<img src="captures/WSDL_4440.png" alt="Analyse du WSDL">

### Tests des opérations
Les différentes fonctionnalités du Web Service ont été testées avec succès :
- **Conversion d'Euro en DH** :
  <img src="captures/ConversionEuroToDH (Katalon studio).png" alt="Test de conversion dans Katalon Studio">

- **Consultation d’un compte** :
  <img src="captures/getCompte (Katalon studio).png" alt="Test de consultation d'un compte">

- **Consultation de la liste des comptes** :
  <img src="captures/listComptes (Katalon studio).png" alt="Test de consultation de la liste des comptes">

---

## Client SOAP Java

Un client SOAP Java a été créé pour interagir avec le Web Service.

<img src="captures/4- Client (Presentation).png" alt="Client SOAP Java">

### Résultat dans la console
<img src="captures/5- Console (Presentation).png" alt="Résultat de la console">
