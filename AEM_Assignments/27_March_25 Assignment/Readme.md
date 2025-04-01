# AEM Training - Day 8 Assignment (27-03-2025) 


### 1. What is MSM, Blueprint, Live Copy, and Rollout?

#### **Multi-Site Management (MSM)**
MSM in AEM (Adobe Experience Manager) allows content authors to manage multiple sites efficiently by creating a relationship between a master site and its copies.

- **Blueprint**: The original source of the content that is copied into other sites.
- **Live Copy**: A copy of the Blueprint that is linked and can receive updates through Rollouts.
- **Rollout**: The action of propagating changes from the Blueprint to the Live Copy.

##### **Use Case**
For example, if we have a master website `/content/us/en`, we can create country-specific sites (`/content/ca/en`, `/content/uk/en`) using MSM. Changes made in `/content/us/en` can be rolled out to other sites.

---

### 2. What is Language Copy?
A **Language Copy** is a translated version of a site for different language locales. It helps in creating multilingual websites without duplicating content manually.

Example:
```
/content/us/en (English)
/content/us/fr (French)
/content/us/es (Spanish)
```
AEM provides translation tools to help with managing language copies.

---

### 3. Create a Site Using MSM (US EN as Source)

#### **Steps to Create MSM Site**
1. Navigate to **AEM Sites** → **Tools** → **MSM Control Center**.
2. Create a new **Blueprint Configuration** with `/content/us/en` as the source.
3. Navigate to **Sites** and create a **Live Copy** using the Blueprint.
4. Define rollout configurations to sync content changes.

📖 **Reference**: [AEM Multi-Site Manager Guide](https://medium.com/@toimrank/aem-multi-site-manager-cd73a9077cba)


### 4. Create McDonald's "About Our Food" Page in AEM

#### **Steps to Author the Page**
1. Navigate to **AEM Sites** and create a new page using the **We.Retail template**.
2. Use AEM components:
   - **Image Component**: Add images from McDonald's website.
   - **Text Component**: Copy text content.
   - **Carousel Component**: For banners.
3. Structure the page layout to match McDonald's page: [McDonald's About Our Food](https://www.mcdonalds.com/us/en-us/about-our-food.html).

---

### 5. Setup Dispatcher on Local

#### **Steps to Install and Configure Dispatcher**

1. **Download Dispatcher Module**:
   - Get the dispatcher module from [Adobe Dispatcher Download](https://experienceleague.adobe.com/docs/experience-manager-dispatcher.html?lang=en).

2. **Install Apache Web Server**:
   ```sh
   sudo apt update
   sudo apt install apache2
   ```

3. **Configure Dispatcher**:
   - Modify `dispatcher.any` and `httpd.conf` to enable caching and security rules.

4. **Test Dispatcher**:
   - Start the Apache server and test using:
   ```sh
   curl -I http://localhost:80/content/we-retail.html
   ```
