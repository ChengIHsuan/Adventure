# Adeventure使用說明

**作品介紹**

此地圖為7*7冒險地圖，每位勇士在冒險開始時會獲得5枚金幣以開始遊戲。地圖中有藥水(生命值hp+10)、金幣(得到3枚金幣)、大小怪物(生命值hp-10/生命值hp-20)、陷阱(生命值hp-30並回到原點)，另外，撞到牆壁生命值hp-10，當生命值hp=0時，遊戲結束。抵達終點時獲得兩枚金幣，若身上仍持有5枚金幣，可再遊玩一次或選擇離開遊戲。

**類別介紹**

* Adventure：main方法執行類別
* Player：玩家的hp值、位置、金幣和回合數的初始值，各種動作執行的方法。cost(遊戲開始時收取5枚金幣)、move(移動後輸出的資訊)、wall(撞到牆)、solution(獲得藥水)、money(撿到金幣)、monster(遇到怪物)、litomonster(遇到小怪物)、trap(掉入陷阱)、end(抵達終點)、again(再玩一次)、result(移動後執行的結果)
* Item：各種物品的位置，方便更改、新增或減少物品位置
* Map：地圖大小(建構子)，可移動且不撞壁的範圍設定
* Rule：規則說明(陣列)

**遊戲方法**

移動方向上下左右相對於數字鍵8,2,4,6，遊戲進行中可按5跳出遊戲。
