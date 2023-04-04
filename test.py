
class Node:

    def __init__(self,data):
        self.data=data
        self.left=self.right=None 
    


class Tree:

    def __init__(self):
        self.root=None 

    def __util(self,root,data):
        if not root:
            return Node(data)
        if data<root.data:
            root.left=self.__util(root.left,data)
        elif data>root.data:
            root.right=self.__util(root.right,data)
        return root 
    
    def insert(self,data):
        self.root=self.__util(self.root,data)

    def __inorder(self,root):
        if root:
           self.__inorder(root.left)
           print(root.data)
           self.__inorder(root.right)

    def __preorder(self,root):
        if root:
            print(root.data)
            self.__preorder(root.left)
            self.__preorder(root.right)
    
    def __postorder(self,root):
        if root:
            self.__postorder(root.left)
            self.__postorder(root.right)
            print(root.data)
    
    def traverseInorder(self):
        temp=self.root
        self.__inorder(temp)
    
    def traversePreorder(self):
        temp=self.root
        self.__preorder(temp)

    def traversePostorder(self):
        temp=self.root
        self.__postorder(temp)

    def levelOrder(self):
        queue=[self.root]        
        while(queue):
            x=queue.pop(0)
            print(x.data)
            if(x.left):
                queue.append(x.left)
            if(x.right):
                queue.append(x.right)


    def sumTree(self,root):
        return root.data + self.sumTree(root.left) + self.sumTree(root.right) if root else 0
    
    def multiplySubtrees(self):
        print(self.sumTree(self.root.left) * self.sumTree(self.root.right))

    def height(self,root):
        if(not root):
            return -1
        return 1 + max(self.height(root.left),self.height(root.right))


# s=Tree()
# s.insert(10)   
# s.insert(5)   
# s.insert(15)   
# s.insert(2)   
# s.insert(7)   
# s.insert(6)   
# s.insert(12)   
# s.insert(17)   
# print(s.height(s.root))



graph = {

    "HYD" : ["BLR"],
    "BLR" : ["CHE","DEL"],
    "CHE" : ["GOI"],
    "GOI" : ["MUB"],
    "DEL" : ["MUB"],
    "MUB" : ["HYD"],
    'USA' : [],

}

def hasPath(src,dest):
    q = [src]
    visited=[src]
    while(q):
        temp=q.pop(0)
        if(temp==dest):
            return True 
        for i in graph[temp]:
            if i not in visited:
                visited.append(i)
                q.append(i)        
    return False

# print(hasPath("HYD","IND"))

graph={
    10 : [20,40,50],
    20 : [10,40],
    30 : [40,50],
    40 : [10,20,30,50],
    50 : [10,30,40]
}

def dfs(graph,start):
    stack = [start]
    visited=[start]
    ans=[]
    while(stack):
        temp = stack.pop();
        for i in reversed(graph[temp]):
            if i not in visited:
                stack.append(i)
                visited.append(i)
        ans.append(temp)
    print(*ans)
    



mat = [
        [1,0,0,1],
        [1,1,0,1],
        [0,1,0,0],
        [1,1,1,1]
    ]


def giveValidCord(mat,x,y):
    coords=[(x+1,y),(x-1,y),(x,y-1),(x,y+1)]
    return list(filter(lambda x:(x[0]>=0 and x[0]<len(mat)) and (x[1]>=0 and x[1]<len(mat[0])) ,coords))





def findPath(mat,startX,startY,destX,destY):
    visited = [(startX,startY)]
    stack = [(startX,startY)]


    while(stack):
        x,y = stack.pop()
        coordinates = giveValidCord(mat,x,y)
        for i in coordinates:
            if(i==(destX,destY)):
                return True
            if i not in visited:
                stack.append(i)
                visited.append(i)

            


def findPath(mat,startX,startY,destX,destY):

    if(startX < 0 or startX >= len(mat) or startY < 0 or startY >= len(mat[0]) ):
        return False

    if(mat[startX][startY]==0):
        return False

    if(startX==destX and startY==destY):        
        return True

    mat[startX][startY]=0
    
    return (findPath(mat,startX-1,startY,destX,destY) or findPath(mat,startX+1,startY,destX,destY) or findPath(mat,startX,startY+1,destX,destY) or findPath(mat,startX,startY-1,destX,destY) )



# if(findPath(mat,0,0,0,3)):
#     print("path Found")
# else:
#     print("path not found")