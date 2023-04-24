def menu():
    print('''\nГлавное меню:
    1. Показать телефоны
    2. Добавить новый телефон 
    3. Продать телефон
    4. Выход''')

    while True:
        try:
            choice = int(input('Выберите пункт меню: '))
            if 0 < choice < 5:
                return choice
            else:
                print('Введите число от 1 до 3')
        except:
            print('Выберите пункт меню, цифры от 1 до 3')


def show_phones(ph: list[dict]):
    for i, contact in enumerate(ph, 1):
        factory = contact.get('Производитель')
        model = contact.get('Модель')
        size = contact.get('Размер экрана')
        quantity = contact.get('Ёмкость батареи')
        os = contact.get('Тип операционной системы')
        price = contact.get('Цена телефона')
        print(f'{i}. {factory:<10} {model:<10} {size:<3} {quantity:<5} {os:<7} {price:<6}')


def new_phone_input():
    factory = input('Введите производителя телефона: ')
    model = input('Введите модель телефона: ')
    size = input('Введите размер экрана: ')
    quantity = input('Введите ёмкость аккумулятора: ')
    os = input('Введите ОС: ')
    price = input('Введите цену: ')
    new_phone = {'Производитель': factory,
                 'Модель': model,
                 'Размер экрана': size,
                 'Ёмкость батареи': quantity,
                 'Тип операционной системы': os,
                 'Цена телефона': price}
    return new_phone


def input_id():
    ind = int(input('Введите индекс: '))
    return ind


def confirm(condition: str, name: str):
    answer = input(f'Вы действительно хотите {condition} телефон {name}? (y/n)')
    if answer == 'y':
        return True
    else:
        return False
